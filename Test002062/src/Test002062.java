public class Test002062 {
    private int num1 = 100;
    class N {
        private int num2 = 200;
    }
    
    public static void main(String[] args) {
        Test002062 outer = new Test002062();
        Test002062.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
    }
}
