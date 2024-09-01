public class Test00086 {

    // What will be the result of compiling and executing Test class?

    // Compilation error at Line n3

    // Compilation error at Line n4
    
    // 24
    
    // 25
    
    // 26

    public static void main(String[] args) throws Exception {
        var x = 7.85; //Line n1
        var y = 5.25f; //Line n2
        var a = (int)x + (int)y; //Line n3
        var b = (int)(x + y); //Line n4
        System.out.println(a + b);
    }
}
