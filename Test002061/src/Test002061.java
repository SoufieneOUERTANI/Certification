public class Test002061 {
    public static void main(String[] args) throws Exception {
        var foo = new Foo(); //Line n3
        var bar = foo.new Bar(); //Line n4
        bar.m1();
    }
}


class Foo {
    public static void m1() { //Line n1
        System.out.println("Foo : m1()");
    }
    class Bar {
        public static void m1() { //Line n2
            System.out.println("Bar : m1()");
        }
    }
}