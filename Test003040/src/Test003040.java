public class Test003040 {

    // What will be the result of compiling and executing Test class?

    // Compilation Error

    // 2
    // 1

    // 2
    // 2

    // 1
    // 1

    // None of the other options

    public static void main(String[] args) throws Exception {
        int i1 = 1;
        Test.change(i1);
        System.out.println(i1);
    }
    public static void change(int num) {
        num++;
        System.out.println(num);
    }
}
