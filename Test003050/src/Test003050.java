public class Test003050 {

    // What will be the result of compiling and executing Test class?

    // 2
    // 3
    // 4
    // 5

    // 1
    // 2
    // 3
    // 4

    // 1
    // 2
    // 3
    // 4
    // 5

    // infinite loop


    public static void main(String[] args) {
        int x = 1;
        while(checkAndIncrement(x)) {
            System.out.println(x);
        }
    }
    
    private static boolean checkAndIncrement(int x) {
        if(x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
    


}
