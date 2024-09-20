public class Test002091 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}


interface I1 {
    void m1();
 
    interface I2 { 
        void m2();
    }
 
    abstract class A1 { 
        public abstract void m3();
    }
 
    class A2 { 
        public void m4() {
            System.out.println(4);
        }
    }
}