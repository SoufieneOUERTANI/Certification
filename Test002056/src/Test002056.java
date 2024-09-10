public class Test002056 {
    public static void main(String[] args) throws Exception {
        // new Outer().new Inner1().printName();
        new Outer().new Inner2().printName();
        // new Outer().new Inner3().printName();
        // new Outer().new Inner4().printName();
        new Outer().new Inner5().printName();

    }
}

class Outer {
    private String name = "NOW OR NEVER";

    // class Inner1 {
    //     public void printName() {
    //         System.out.println(this.name);
    //     }
    // }

    class Inner2 {
        public void printName() {
            System.out.println(name);
        }
    }

    // inner class Inner3 {
    //     public void printName() {
    //         System.out.println(name);
    //     }
    // }

    abstract class Inner4 {
        public void printName() {
            System.out.println(name);
        }
    }

    class Inner5 {
        public void printName() {
            System.out.println(Outer.this.name);
        }
    }
}
