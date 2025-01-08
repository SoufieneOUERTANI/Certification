// What will be the result of compiling and executing Test class?

// An Exception is thrown at runtime

// Compilation error at Line n2

// It prints STATIC METHOD!!! on to the console

// None of the other options

public class Test003052 {
    public static void print() {
        System.out.println("STATIC METHOD!!!");
    }
    
    public static void main(String[] args) {
        Test003052 obj = null; //Line n1
        obj.print(); //Line n2
    }
}
