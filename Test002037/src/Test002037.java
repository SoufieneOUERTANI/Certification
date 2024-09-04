public class Test002037 {
    public static void main(String[] args) throws Exception {
        int ctr = 100;
        one: for (var i = 0; i < 10; i++) {
            two: for (var j = 0; j < 7; j++) {
                three: while (true) {
                    ctr++;
                    if (i > j) {
                        break one;
                    } else if (i == j) {
                        break two;
                    } else {
                        break three;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
}
