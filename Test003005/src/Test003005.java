public class Test003005 {
    static int a = 10000;
    static {
        a = -a--;
    }
    {
        a = -a++;
    }
 
    public static void main(String[] args) {
        System.out.println(a);
    }
}
