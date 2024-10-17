public class Test003027 {
    public String color;
    
    public Test003027(String color) {
        this.color = color;
    }
    
    public static void main(String [] args) {
        Test003027 apple = new Test003027("GREEN");
        System.out.println(apple.color);
    }
}