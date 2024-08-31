import javax.sound.sampled.Line;

public class Test00080 {

    // What is the result of compiling and executing Test class?

    // Only Line n1 causes compilation error

    // Only Line n2 causes compilation error

    // Only Line n3 causes compilation error

    // Only Line n1 and Line n3 cause compilation error

    // Line n1, Line n2 and Line n3 cause compilation error

    // Code compiles successfully and prints 200 on to the console

    // Code compiles successfully and prints 100100 on to the console

    public static void main(String[] args) throws Exception {
        var x = "100"; //Line n1
        var y = 100; //Line n2
        System.out.println(x + y); //Line n3
    }
}
