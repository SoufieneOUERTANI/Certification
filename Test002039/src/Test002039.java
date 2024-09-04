public class Test002039 {
    public static void main(String[] args) throws Exception {
        outer: for(var i = 0; i < 3; System.out.print(i)) { // 0
            i++; // 1
            inner: for(var j = 0; j < 3; System.out.print(j)) { //0
                if(i > ++j) {
                    break outer;
                }
            }
        }
    }
}
