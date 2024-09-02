public class Test002024 {
    // What will be the result of compiling and executing Test class?

    // 25

    // 55

    // Compilation error

    // 24
    public static void main(String[] args) throws Exception {
        int start = 1;
        int sum = 0;
        do {
            if(start % 2 == 0) {
                continue;
            }
            sum += start; //Line n1
        } while(++start <= 10);
        System.out.println(sum);
    }
}
