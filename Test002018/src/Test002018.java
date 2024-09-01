public class Test002018 {

    // What is the result of compiling and executing Test class?

    // ONE
    // TWO
    // THREE
    
    // Two
    // THREE
    
    // THREE
    
    // None of the other options

    public static void main(String[] args) throws Exception {
        Boolean b = Boolean.valueOf("tRUe");
        switch(b) {
            case true:
                System.out.println("ONE");
            case false:
                System.out.println("TWO");
            default: 
                System.out.println("THREE");
        }
    }
}
