public class Test002010 {

    // What will be the result of compiling and executing Test class?

    // var is 100

    // var is 200
    
    // In default
    
    // Compilation error

    public static void main(String[] args) throws Exception {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
            case 200:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }
    }
}
