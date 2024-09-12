class A {
    static class B {
        
    }
}
 
public class Test002085 {

    // B obj = new B();
    // B obj = new A.B();
    // A.B obj = new A.B();
    A.B obj = new A().new B();

}