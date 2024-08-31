public class Test00066 {
    public static void main(String[] args) throws Exception {

        // Which of the following statements is correct?

        // Only one statement causes compilation error

        // Two statements cause compilation error

        // Three statements cause compilation error

        // Four statements cause compilation error

        // No compilation error

        String str = "Game on"; //Line n1
        StringBuilder sb = new StringBuilder(str); //Line n2
        
        System.out.println(str.contentEquals(sb)); //Line n3
        // The method contentEquals(String) is undefined for the type StringBuilder
        // System.out.println(sb.contentEquals(str)); //Line n4
        System.out.println(sb.equals(str)); //Line n5
        System.out.println(str.equals(sb)); //Line n6
    }
}
