public class Test00077 {
    // What will be the result of compiling and executing Test class?

    // 20
    // 20
    
    // 25
    // 10
    
    // 20
    // 10
    
    // 25
    // 25
    
    // 10
    // 10

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder(20); //Line n1
        sb.append("A".repeat(25)); //Line n2
        System.out.println(sb.toString().length()); //Line n3
        
        sb.setLength(10); //Line n4
        System.out.println(sb.toString().length()); //Line n5
    }
}
