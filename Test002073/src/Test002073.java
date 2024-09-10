class Greet {
    public void sayHello() {
        System.out.println("Hello!");
    }
}
 
public class Test002073 {
    public static void main(String[] args) {
        Greet obj = new Greet() {
            public void SayHello() {
                System.out.println("HELLO!");
            }
        };
        obj.sayHello();
    }
}