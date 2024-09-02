public class Test002032 {
    public static void main(String[] args) throws Exception {
        var var = 0; //Line n1
        var: for (; var < 3; var++) {  //Line n2
            if (var % 2 == 0) {
                continue var; //Line n3
            }
            var++; //Line n4
        }
        System.out.println(var);
    }
}
