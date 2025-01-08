public class Test003057 {

    // What will be the result of compiling and executing Test class?

    // It executes successfully and prints A on to the console

    // It executes successfully and prints B on to the console
    
    // It executes successfully and prints C on to the console
    
    // Compilation error
    
    // An exception is thrown at runtime

    public static void main(String[] args) throws Exception {
        A obj1 = new C();
        A obj2 = new B();
        C obj3 = (C)obj1;
        C obj4 = (C)obj2;
        obj3.print();
    }
}

class A {
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    public void print() {
        System.out.println("B");
    }
}

class C extends A {
    public void print() {
        System.out.println("C");
    }
}
