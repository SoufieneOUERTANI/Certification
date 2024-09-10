class Outer {
    private String msg = "A";
    public void print() {
        final String msg = "B";
        class Inner {
            public void print() {
                System.out.println(this.msg);
            }
        }
        Inner obj = new Inner();
        obj.print();
    }
}
 
public class Test002071 {
    public static void main(String[] args) {
        new Outer().print(); 
    }
}
