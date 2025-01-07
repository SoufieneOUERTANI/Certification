public class Test003039 {
    // Which of the following needs to be done so that LIGHT is printed on to the console?

    public static void main(String[] args) throws Exception {
        byte b = 10; //Line n4
        new Car().speed(b); //Line n5
    }
}

class Car {
    void speed(Byte val) { //Line n1
        System.out.println("DARK"); //Line n2
    } //Line n3
 
    void speed(byte... vals) {
        System.out.println("LIGHT");
    }
}
