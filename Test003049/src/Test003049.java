public class Test003049 {

    // Which of the following statements are correct regarding above code?
    // Select 3 options.

    // Line n1 causes compilation error

    // Line n2 causes compilation error

    // Line n3 causes compilation error

    // Line n4 causes compilation error

    // Line n5 causes compilation error

    // Line n6 causes compilation error

    // Line n7 causes compilation error

    // Above code compiles successfully

    // Above code prints 8 on execution

    // Above code prints 30 on execution

    int i1 = 10;
    static int i2 = 20;
    
    private void change1(int val) {
        i1 = ++val; //Line n1
        i2 = val++; //Line n2
    }
    
    private static void change2(int val) {
        i1 = --val; //Line n3
        i2 = val--; //Line n4
    }
    
    public static void main(String[] args) {
        change1(5); //Line n5
        change2(5); //Line n6
        System.out.println(i1 + i2); //Line n7
    }
}
