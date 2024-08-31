public class Test00064 {

    // What will be the result of compiling and executing Test class?

    // Hakuna

    // _Matata
    
    // Hakuna_Matata
    
    // None of the other options

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hakuna"); //Line n3
        change(sb); //Line n4
        System.out.println(sb); //Line n5
    }
    
    private static void change(StringBuilder s) {
        s.append("_Matata"); //Line n9
    }
}
