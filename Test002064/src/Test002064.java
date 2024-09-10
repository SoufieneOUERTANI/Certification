class P {
    private int var = 100;
    class Q {
        String var = "Java";
        void print() {
            System.out.println(var);
        }
    }
}

public class Test002064 {
    public static void main(String[] args) {
        new P().new Q().print();
    }
}
