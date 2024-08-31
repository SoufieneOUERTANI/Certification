public class Test00072 {
    public static void main(String[] args) throws Exception {
        // What will be the result of compiling and executing Test class?

        // Compilation error

        // An exception is thrown at runtime

        // 01234567

        // 89

        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8, 1000);
        System.out.println(sb);
    }
}
