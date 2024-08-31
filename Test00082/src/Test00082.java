import java.util.ArrayList;

import javax.sound.sampled.Line;

public class Test00082 {

    // Which of the following statements are correct?

    // Select 3 options.

    // Line ni compiles successfully

    // Line n2 compiles successfully

    // Line n3 compiles successfully

    // Line n4 compiles successfully

    // Line n5 compiles successfully

    // Line n6 compiles successfully
    

    // // 'var' is not allowed hereJava(1073743335)
    // private var place = "Unknown";  //Line n1
    // // 'var' is not allowed hereJava(1073743335)
    // public static final var DISTANCE = 200; //Line n2
    
    public static void main(String[] args) {
        var list1 = new ArrayList<>(); //Line n3
        var list2 = new ArrayList(); //Line n4
        
        // // Lambda expression needs an explicit target-type
        // var lambda1 = () -> System.out.println("Hello"); //Line n5
        
        var var = 100; //Line n6
    }

}
