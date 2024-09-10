public class Test002068 {
    public static void main(String[] args) throws Exception {
        new A().someMethod("World!");
    }
}

class A {
    public void someMethod(final String name) {

        // /*INSERT*/ {
        //     void print() {
        //         System.out.println("Hello " + name);
        //     }
        // }

        // public class B1 {
        //     void print() {
        //         System.out.println("Hello " + name);
        //     }
        // }
        // new B1().print();
        
        // protected class B2 {
        //     void print() {
        //         System.out.println("Hello " + name);
        //     }
        // }
        // new B2().print();

        class B3 {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B3().print();

        // private class B4 {
        //     void print() {
        //         System.out.println("Hello " + name);
        //     }
        // }
        // new B4().print();

        final class B5 {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B5().print();

        // abstract class B6 {
        //     void print() {
        //         System.out.println("Hello " + name);
        //     }
        // }
        // new B6().print();

    }
}
