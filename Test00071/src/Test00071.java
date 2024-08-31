public class Test00071 {
    public static void main(String[] args) throws Exception {

        // What will be the result of compiling and executing Test class?

        // 21

        // 0

        // 16
        
        // An exception is thrown at runtime

        StringBuilder sb = new StringBuilder("Friends are treasures");
        sb.delete(0, 100);
        System.out.println(sb.length());
    }
}
