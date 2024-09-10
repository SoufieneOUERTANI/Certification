public class Test002060 {
    public static void main(String[] args) throws Exception {
        B obj = new A().new B();
    }
}

class A {
    A() {
        System.out.print(1);
    }
    class B {
        B() {
            System.out.print(2);
        }
    }
}
