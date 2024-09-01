public class Test002008 {

    // What will be the output of compiling and executing the Test class?

    // 5

    // 10

    // 30

    // 120

    public static void main(String[] args) throws Exception {
        int a = 5;
        int x = 10;
        switch(x) {
            case 10:
                a *= 2;
            case 20:
                a *= 3;
            case 30:
                a *= 4;
        }
        System.out.println(a);
    }
}
