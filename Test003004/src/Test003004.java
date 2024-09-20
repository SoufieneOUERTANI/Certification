class Person {
    String name;
    int age;
    
    Person() {
        Person("Rohit", 25);
        // super("Rohit", 25);
        // this("Rohit", 25);
        // this.Person("Rohit", 25);
    }
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // void Person(String name, int age) {
    //    this.name = name;
    //    this.age = age;
    // }
}
 
public class Test003004 {

    // There is a compilation error in the Person class.
    // Which two modifications, done independently, print "Rohit:25" on to the console?

    // 1- 
    // Add below code in the Person class:
    // void Person(String name, int age) {
    //    this.name = name;
    //    this.age = age;
    // }
    // 2-
    // Replace Person("Rohit", 25); with super("Rohit", 25);
    // 3-
    // Replace Person("Rohit", 25); with this("Rohit", 25);
    // 4-
    // Replace Person("Rohit", 25); with this.Person("Rohit", 25);

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name + ":" + p.age);
    }
}