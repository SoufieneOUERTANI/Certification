public class Test00083 {

    // What is the result of compiling and executing above code?

    // 30
    // AB
    // 66
    
    // 30
    // AB
    // At
    
    // 1020
    // AB
    // At
    
    // 1020
    // AB
    // 66
    
    // Compilation error
    
    // Runtime error

    public static void main(String[] args) {
        operate(10 , 20);
        operate("A", "B");
        operate('A', 1); //ASCII code of 'A' is 65
    }
    
    // 'var' is not allowed hereJava(1073743335)
    // public static void operate(var v1, var v2) {
    //     System.out.println(v1 + v2);
    // }
}
