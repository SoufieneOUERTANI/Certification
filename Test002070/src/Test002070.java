class A {
    public void print(String name) {
        class B {
            B() {
                System.out.println(name); //Line n1
            }
        }
    }
    B obj = new B(); //Line n2
}
 
public class Test002070 {
    public static void main(String[] args) {
        new A().print("OCP"); //Line n3
    }
}
