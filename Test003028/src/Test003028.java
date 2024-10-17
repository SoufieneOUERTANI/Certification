public class Test003028 {
    String msg = null;
    
    public Test003028() {
        this("Good Morning!");
    }
    
    public Test003028(String str) {
        msg = str;
    }
    
    public void display() {
        System.out.println(msg);
    }
    
    public static void main(String [] args) {
        Test003028 g1 = new Test003028();
        Test003028 g2 = new Test003028("Good Evening!");
        g1.display();
        g2.display();
    }
}