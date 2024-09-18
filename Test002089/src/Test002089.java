class Outer {
    static class Inner {
        static void greetings(String s) {
            System.out.println(s);
        }
    }
}
 
public class Test002089 {
    public static void main(String[] args) {

        // Outer.Inner inner1 = new Outer().new Inner();
        // inner1.greetings("HELLO!");

        Outer.Inner inner2 = new Outer.Inner();
        inner2.greetings("HELLO!");

        Outer.Inner.greetings("HELLO!");

        // Inner .greetings("HELLO!") ;

    }
}
