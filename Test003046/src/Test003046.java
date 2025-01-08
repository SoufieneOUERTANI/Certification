public class Test003046 {

    // What will be the result of compiling and executing Test class?

    // Above code causes compilation error

    // It compiles successfully and on execution prints 3333 on to the console

    // It compiles successfully and on execution prints 1233 on to the console

    // It compiles successfully and on execution prints 1333 on to the console

    private static void m(int i) {
        System.out.print(1);
    }
    
    private static void m(int i1, int i2) {
        System.out.print(2);
    }
    
    private static void m(char... args) {
        System.out.print(3);
    }
    
    public static void main(String... args) {
        m('A');
        m('A', 'B');
        m('A', 'B', 'C');
        m('A', 'B', 'C', 'D');
    }
}
