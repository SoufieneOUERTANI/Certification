public class Test002065 {
    public static void main(String[] args) throws Exception {
        new Foo().new Bar();
    }
}

class Foo {
    static { //static initializer block
        System.out.print("A");
    }
    class Bar {
        static { //static initializer block
            System.out.print("B");
        }
    }
}