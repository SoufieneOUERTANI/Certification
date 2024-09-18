class Outer {
    private static int i = 10;
    private int j = 20;
    
    static class Inner {
        void add() {
            System.out.println(i + j);
        }
    }
}
 
public class Test002088 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.add();
    }
}
