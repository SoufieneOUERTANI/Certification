interface I1 {
    void m1();
}
 
public class Test002079 {
    public static void main(String[] args) {
        I1 i1 = new I1() {
            @Override
            public void m1() {
                System.out.println(1234);
            }
        }
        i1.m1();
    }
}