public class Test00058 {

    // Which of the following statements are correct about above snippets?

    // Snippet 1 compiles successfully

    // Snippet 2 compiles successfully
    
    // Snippet 3 compiles successfully
    
    // Snippet 4 compiles successfully
    
    // Snippet 1 throws runtime exception
    
    // Snippet 2 throws runtime exception
    
    // Snippet 3 throws runtime exception
    
    // Snippet 4 throws runtime exception

    public static void main(String[] args) throws Exception {
        String [] arr1 = {null, null};
        System.out.println("1. " + String.join("::", arr1));
        
        String [] arr2 = {};
        System.out.println("2. " + String.join("-", arr2));
        
        String [] arr3 = null;
        System.out.println("3. " + String.join(".", arr3));
        
        // The method join(CharSequence, CharSequence[]) is ambiguous for the type String
        // System.out.println("4. " + String.join(".", null));
    }
}
