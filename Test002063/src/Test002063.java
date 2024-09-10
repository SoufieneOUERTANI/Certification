public class Test002063 {
    public static void main(String[] args) throws Exception {
        new X().invokeInner();
// >>>>>>>>>>>>>>>>>>>>>>>>>>>
        new X().invokeInner_Reflexion();
    }
}


class X {
    class Y {
        private void m() {
            System.out.println("INNER");
        }
    }
    
    public void invokeInner() {
        var obj = new Y(); //Line n1
        obj.m(); //Line n2
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>

    public void invokeInner_Reflexion() throws Exception {
        var obj = new Y(); // Line n1
        var method = Y.class.getDeclaredMethod("m");
        method.setAccessible(true); // Bypass private access
        method.invoke(obj); // Line n2
    }
}