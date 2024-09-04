public class Test002038 {
    public static void main(String[] args) throws Exception {
        var i = 1;
        var j = 5;
        var k = 0;
        A: while(true) {
            i++; // 2
            B: while(true) {
                j--; // 4 => 3 => 2
                C: while(true) {
                    k += i + j; // 6 => 11 => 15
                    if(i == j)
                        break A;
                    else if (i > j)
                        continue A;
                    else 
                        continue B;
                }
            }
        }
        System.out.println(k);
    }
}
