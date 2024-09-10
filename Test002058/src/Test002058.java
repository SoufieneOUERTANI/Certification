public class Test002058 {
    public static void main(String[] args) throws Exception {
        // new A().new B().m1();

        // new A.B().m1();
        
        new A().new B("Winners never quit").m1();
        
        new A().new B(null).m1();
    }
}

class A {
    private String str = "WINNERS NEVER QUIT";
    public class B {
        public B(String s) {
            if(s != null)
                str = s;
        }
        public void m1() {
            System.out.println(str);
        }
    }
}
