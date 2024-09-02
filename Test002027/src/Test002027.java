public class Test002027 {
    public static void main(String[] args) throws Exception {
        for:
        for (int i = 2; i <= 100; i = i + 2) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
            if(i == 10) {
                break for;
            }
        }
    }
}
