public class Test002009 {

    // What will be the result of compiling and executing Test class?

    // Compilation error

    // Failed

    // Not a valid score
    // Failed

    // Passed

    public static void main(String[] args) throws Exception {
        int score = 60;
        switch (score) {
            default:
                System.out.println("Not a valid score");
            case score < 70:
                System.out.println("Failed");
                break;
            case score >= 70:
                System.out.println("Passed");
                break;
        }
    }
}
