public class Test00076 {

    // What will be the result of compiling and executing Test class?

    // THERMAL:ELECTROTHERMAL

    // ELECTRO:ELECTROTHERMAL
    
    // ELECTROTHERMAL:THERMAL
    
    // ELECTROTHERMAL:ELECTRO
    
    // ELECTRO:ELECTRO
    
    // ELECTRO:THERMAL
    
    // THERMAL:ELECTRO
    
    // THERMAL:THERMAL


    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder("ELECTROTHERMAL"); //Line n1
        sb.setLength(7); //Line n2
        System.out.print(sb.toString().strip()); //Line n3
        System.out.print(":"); //Line n4
        sb.setLength(14); //Line n5
        System.out.println(sb.toString().strip()); //Line n6
    }
}
