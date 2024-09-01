public class Test002005 {

    // What is the result of compiling and executing Test class?

    // Compilation error

    // A

    // B

    // C

    // D

    // F

    public static void main(String[] args) throws Exception {
        var score = 30; // Line n1
        var grade = 'F'; // Line n2
        if (50 <= score < 60) // Line n3
            grade = 'D';
        else if (60 <= score < 70) // Line n4
            grade = 'C';
        else if (70 <= score < 80) // Line n5
            grade = 'B';
        else if (score >= 80)
            grade = 'A';
        System.out.println(grade);
    }
}
