
public class Test003036 {
    public static void main(String[] args) {
        Student s = new Student(); //Line n2
        System.out.println(s.name + ":" + s.age); //Line n3
    }
}

class Student {
    String name;
    int age;
    
    void Student() {
        Student("James", 25); //Line n1
    }
    
    void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}