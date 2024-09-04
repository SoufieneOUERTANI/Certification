public class Test002048 {
    public static void main(String[] args) {
        Student stud = new Student(); //Line n1
        System.out.println(stud.name + stud.height + stud.result + stud.age); //Line n2
    }
}

class Student {
    String name;
    int age;
    boolean result;
    double height;
}
