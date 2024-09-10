public class Test002066_ExecutionSequenceFlow {

    // Static block
    static {
        System.out.println("Static block 1");
    }
    
    static int staticVar = initializeStaticVar();
    
    static {
        System.out.println("Static block 2");
    }
    
    static int initializeStaticVar() {
        System.out.println("Static variable initialized");
        return 42;
    }
    
    // Instance block
    {
        System.out.println("Instance block executed");
    }
    
    int instanceVar = initializeInstanceVar();
    
    int initializeInstanceVar() {
        System.out.println("Instance variable initialized");
        return 100;
    }
    
    // Constructor
    public Test002066_ExecutionSequenceFlow() {
        System.out.println("Constructor executed");
    }
    
    // Main method (Entry point)
    public static void main(String[] args) {
        System.out.println("Main method executed");
        Test002066_ExecutionSequenceFlow obj = new Test002066_ExecutionSequenceFlow();  // Object creation
        obj.myMethod();               // Method call
    }
    
    // Method
    public void myMethod() {
        System.out.println("Method executed");
    }
 }
 
