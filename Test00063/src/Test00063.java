public class Test00063 {

    // Which of the following changes, done independently, allows the code to compile and on execution prints true?

    // Replace Line n1 with: String s1= "ALLIS WELL";
    // Replace Line n2 with: String s2 = "ALLIS WELL";
    
    // Replace Line n1 with: String s1 = new String("ALL IS WELL").intern();
    // Replace Line n2 with: String s2 = new String("ALL IS WELL"). intern();
    
    // Replace Line n2 with: String s2 = s1.toString();
    
    // Replace Line n3 with: System.out.printin(s1.toString() == s2.toString());

    public static void main(String[] args) throws Exception {
        String s1 = new String("ALL IS WELL"); //Line n1
        String s2 = new String("ALL IS WELL"); //Line n2
        System.out.println(s1 == s2); //Line n3

        //>>>

        String             s11 = "ALL IS WELL"; //Line n1
        String             s21 = "ALL IS WELL"; //Line n2
        System.out.println(s11 == s21); //Line n3

        String             s12 = new String("ALL IS WELL").intern(); //Line n1
        String             s22 = new String("ALL IS WELL").intern(); //Line n2
        System.out.println(s12 == s22); //Line n3

        String             s13 = new String("ALL IS WELL"); //Line n1
        String             s23 = s13.toString(); //Line n2
        System.out.println(s13 == s23); //Line n3

        String             s14 = new String("ALL IS WELL"); //Line n1
        String             s24 = new String("ALL IS WELL"); //Line n2
        System.out.println(s14.toString() == s24.toString()); //Line n3
    }
}
