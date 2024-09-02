public class Test002023 {

    // Which of the following statements is correct for above code?

    // Compiles successfully and on execution prints DOWN

    // Compiles successfully and on execution prints SLOW- in infinite loop
    
    // Unreachable code compilation error
    
    // Compiles successfully and on execution prints SLOW-DOWN

    public static void main(String[] args) throws Exception {
        do {
            System.out.print("SLOW-");
        } while (false);
 
        System.out.println("DOWN");
    }
}
