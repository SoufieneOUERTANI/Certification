public class Test003054 {
    // What will be the result of compiling and executing above code?

    // A-B-C-

    // AB-C-
    
    // Compilation error in class Y
    
    // Compilation error in class Test

    public static void main(String[] args) throws Exception {
        X obj = new Y(); //Line n1
        obj.A(); //Line n2
        obj.B(); //Line n3
        obj.C(); //Line n4
        
    }
}

class X {
    void A() {
        System.out.print("A");
    }
}
 
class Y extends X {
    void A() {
        System.out.print("A-");
    }
    
    void B() {
        System.out.print("B-");
    }
    
    void C() {
        System.out.print("C-");
    }
}