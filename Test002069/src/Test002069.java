class Outer {
    public static void sayHello() {}
    static {
        class Inner {
            {
                System.out.println("HELLO");
            }
            // static {
            //     System.out.println("HELLO");
            // }
            Inner() {
                System.out.println("HELLO");
            }
            Inner(String s) {
                System.out.println(s);
            }
        }
        new Inner();
    }
}
 
public class Test002069 {
    public static void main(String[] args) {
        Outer.sayHello();
    }
}
