class Employee {
    String name;
    int age;
    
    Employee() {
        Employee("Michael", 22); //Line n1
    }
    
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 
public class Test003003 {
    public static void main(String[] args) {
        Employee emp = new Employee(); 
        System.out.println(emp.name + ":" + emp.age); //Line n2
    }
}