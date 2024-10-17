class Super {
    { System.out.print("A");}
    Super(String str) {
        System.out.print(str);
    }
    static {
        System.out.print("1");
    }
    { System.out.print("B");}
}
 
class Sub extends Super {
    static { System.out.print("2"); }
    Sub(String str) {
        super(str);
        System.out.print(str);
    }
    { System.out.print("C"); }
    static {
        System.out.print("3");
    }
}
 
public class Test003011 {
    public static void main(String[] args) {
        new Sub("Z");
     }
}