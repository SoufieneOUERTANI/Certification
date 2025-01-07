public class Test003035 {
    private static void m(int x) {
        System.out.println("INT VERSION");
    }
    
    private static void m(char x) {
        System.out.println("CHAR VERSION");
    }
    
    public static void main(String [] args) {
        int i = '5';
        m(i);
        m('5');
    }
}
