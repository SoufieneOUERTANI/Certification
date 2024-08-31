public class Test00070 {
    // What will be the result of compiling and executing Test class?

    // 100:100

    // 100:0
    
    // 16:16
    
    // 16:0
    
    // 0:0
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() + ":" + sb.toString().length());
    }
}
