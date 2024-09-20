public class Test003002 {
    String quote = null;
    public Test003002() {
    }
    
    public Test003002(String str) {
        quote = str;
    }
    
    public void display() {
        System.out.println(quote);
    }
    
    public static void main(String [] args) {
        Test003002 q1 = new Test003002();
        Test003002 q2 = new Test003002("NEVER GIVE UP!");
        q1.display();
        q1.display();
    }
}
