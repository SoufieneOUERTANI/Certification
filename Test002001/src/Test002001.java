public class Test002001 {

    // What will be the result of compiling and executing Test class?

    // EQUAL 12

    // EQUAL 11
    
    // NOT EQUAL 12
    
    // NOT EQUAL 11

    public static void main(String[] args) throws Exception {
        int num = 10;
        if(num++ == num++) {
            System.out.println("EQUAL " + num);
        } else {
            System.out.println("NOT EQUAL " + num);
        }
    }
}
