public class Test00067 {
    public static void main(String[] args) throws Exception {

        // What will be the result of compiling and executing Test class?

        // Compilation error

        // true

        // false

        // An exception is thrown at runtime

        StringBuilder sb = new StringBuilder("Dream BIG");
        String s1 = sb.toString();
        String s2 = sb.toString();
        
        System.out.println(s1 == s2);
    }
}
