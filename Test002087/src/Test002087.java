

class Outer {
    abstract static class Animal { //Line n1
        abstract void eat();
    }
    
    static class Dog extends Animal { //Line n2
        void eat() { //Line n3
            System.out.println("DOG EATS BISCUITS");
        }
    }
}
 
public class Test002087 {
    public static void main(String[] args) {
        Outer.Animal animal = new Outer.Dog(); //Line n4
        animal.eat();
    }
}
