public class Person {
    public String name;
    public void Person() {
        name = "James";
    }
    
    public static void main(String [] args) {
        Person obj = new Person();
        System.out.println(obj.name);
    }
}
