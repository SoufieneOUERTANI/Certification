public class Test002086 {
    private static class B {
        private void log() {
            System.out.println("BE THE CHANGE");
        }
    }
    
    // L'essentiel est qu'il y a un seul "new", and in the front(new B() or new Test002086.B())

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.log();

        // B obj3 = new Test002086().new B();
        // obj3.log();

        Test002086.B obj2 = new Test002086.B();
        obj2.log();
        
        // Test002086.B obj4 = new Test002086().new B();
        // obj4.log();
        
        var obj5 = new Test002086.B();
        obj5.log();

        // >>>>>>>>>>>>>>>>>>>>>>

        Test002086.B obj6 = new B();
        obj6.log();
        
        // Test002086.B obj7 = Test002086.new B();
        // obj7.log();
    }
}
