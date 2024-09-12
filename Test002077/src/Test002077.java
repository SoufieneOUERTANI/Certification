abstract class Greetings {
    abstract void greet();
}
 
public class Test002077 {
    public static void main(String[] args) {
        var obj = new Greetings() {
            @Override public void greet() {
                System.out.println("BELIEVE IN YOURSELF");
            }
        };
        obj.greet();
    }
}