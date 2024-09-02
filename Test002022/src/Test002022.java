public class Test002022 {
    public static void main(String[] args) throws Exception {
        
        // Which of the following statements is correct for above code?

        // Compiles successfully and on execution prints 200

        // Compiles successfully and on execution prints 100 in infinite loop
        
        // Unreachable code compilation error
        
        // Compiles successfully and on execution prints 100200

        do {
            System.out.print(100);
        } while (true); //Line n1
        
        System.out.println(200); //Line n2
    }
}
