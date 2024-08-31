public class Test00078 {
    // What will be the result of compiling and executing Test class?

    // BA

    // AB
    
    // BAB
    
    // ABA
    
    // ABAB
    
    // BABA
    
    // ABBA

    // compilation error at line 2

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("B"); //Line n1
        sb.append(sb.append("A")); //Line n2
        System.out.println(sb); //Line n3;
    }
}
