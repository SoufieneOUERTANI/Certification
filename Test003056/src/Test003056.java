public class Test003056 {

    // What will be the result of compiling and executing Test class?

    // MNO

    // MNP
    
    // NOP
    
    // MOP
    
    // MNOP

    // O

    // M

    public static void main(String[] args) throws Exception {
        M obj = new O();
        if(obj instanceof M) 
          System.out.print("M");
        if(obj instanceof N) 
          System.out.print("N");
        if(obj instanceof O) 
          System.out.print("O");
        if(obj instanceof P) 
          System.out.print("P");    }
}

class M { }
class N extends M { }
class O extends N { }
class P extends O { }
