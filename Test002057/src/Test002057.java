public class Test002057 {
    class A {
        void m() {
            System.out.println("OVER AND OUT");
        }
    }
    
    public static void main(String [] args) {
        A a1 = new Test002057().new A();
        a1.m();
        
        Test002057.A a2 = new Test002057().new A();
        a2.m();
        
        // A a3 = this.new A();
        // a3.m();
        
        // var a4 = new A();
        // a4.m();
        
        var a5 = new Test002057().new A();
        a5.m();
        
        // Test002057.A a6 = new A();
        // a6.m();
    }
}
