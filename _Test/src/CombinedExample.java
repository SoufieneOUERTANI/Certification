// Superclass demonstrating static blocks, instance blocks, and constructors
class Super {
    // Static block, executed when the class is loaded
    static {
        System.out.print("=> 1"+ ", Super, static, "); // Static block of Super
    }

    // Instance initializer block
    {
        System.out.print("=> A"+ ", Super, instance, "); // First instance block of Super
    }

    // Another instance initializer block
    {
        System.out.print("=> B"+ ", Super, instance, "); // Second instance block of Super
    }

    Super() {
        System.out.print("=> Super, constructor, "); // Constructor
    }

    // Constructor with a parameter
    Super(String str) {
        System.out.print("=> "+str+ ", Super, constructor, "); // Constructor prints the passed string
    }
}

// Subclass inheriting from Super and demonstrating similar principles
class Sub extends Super {
    // Static block, executed when the class is loaded
    static {
        System.out.print("=> "+"2"+ ", Sub, static, "); // First static block of Sub
    }

    // Another static block
    static {
        System.out.print("=> "+"3"+ ", Sub, static, "); // Second static block of Sub
    }

    // Instance initializer block
    {
        System.out.print("=> "+"C"+ ", Sub, instance bloc, "); // Instance block of Sub
    }

    // Constructor with a parameter
    Sub(String str) {
        // super(str); // Calls the constructor of Super
        System.out.print("=> "+str + ", Sub, constructor, "); // Prints the passed string
    }
}

// Class demonstrating control flow and instance methods
class MyClass {
    // Static block, executed when the class is loaded
    static {
        System.out.println("\nStatic block: MyClass is loaded");
    }

    // Instance initializer block
    {
        System.out.println("Instance initializer block: MyClass object is being created");
    }

    // Constructor
    public MyClass() {
        System.out.println("Constructor: MyClass object is fully created");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static method: MyClass Executed without an object");
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method: MyClass Executed by an object");
    }

    // Method demonstrating flow of control
    public void controlFlowExample(int x) {
        if (x > 0) {
            System.out.println("Control flow: MyClass controlFlowExample x is positive");
        } else if (x < 0) {
            System.out.println("Control flow: MyClass controlFlowExample x is negative");
        } else {
            System.out.println("Control flow: MyClass controlFlowExample x is zero");
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop MyClass controlFlowExample : i = " + i);
        }
    }
}

// Main class demonstrating the execution sequence
public class CombinedExample {
    // Static block, executed when the class is loaded
    static {
        System.out.println("Static block 1, CombinedExample");
    }

    // Static variable initialization with a method
    static int staticVar = initializeStaticVar();

    // Another static block
    static {
        System.out.println("Static block 2, CombinedExample");
    }

    // Static method to initialize static variables
    static int initializeStaticVar() {
        System.out.println("Static variable initialized, CombinedExample");
        return 42;
    }

    // Instance initializer block
    {
        System.out.println("Instance block executed, CombinedExample");
    }

    // Instance variable initialization with a method
    int instanceVar = initializeInstanceVar();

    // Method to initialize instance variables
    int initializeInstanceVar() {
        System.out.println("Instance variable initialized, CombinedExample");
        return 100;
    }

    // Constructor
    public CombinedExample() {
        System.out.println("Constructor executed, CombinedExample");
    }

    // Main method (Entry point)
    public static void main(String[] args) {
        // Demonstration of static and instance block execution with inheritance
        System.out.println("\n--- Creating Sub instance ---, main CombinedExample");
        new Sub("Z");  // Create an instance of Sub class

        // Step 1: Call static method from MyClass (this will load the class)
        System.out.println("\n--- Main method executed ---, main CombinedExample");
        MyClass.staticMethod();  // Static method call

        // Step 2: Create object of MyClass (Instance initializer + Constructor)
        MyClass myClassObj = new MyClass();

        // Step 3: Call instance method from MyClass
        myClassObj.instanceMethod();

        // Step 4: Control flow demonstration
        myClassObj.controlFlowExample(1);
        myClassObj.controlFlowExample(0);
        myClassObj.controlFlowExample(-1);

        // Step 5: Create object of CombinedExample
        System.out.println("\n--- Creating CombinedExample instance ---, main CombinedExample");
        CombinedExample obj = new CombinedExample();  // Object creation
        obj.myMethod();  // Method call
    }

    // Method
    public void myMethod() {
        System.out.println("Method executed, myMethod CombinedExample");
    }

    static {
        System.out.println("Static block 3, CombinedExample");
    }
}