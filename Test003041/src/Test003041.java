public class Test003041 {

    // What will be the result of compiling and executing AvoidThreats class?

    // VIRUS
    // PHISHING

    // PHISHING
    // PHISHING

    // VIRUS
    // VIRUS

    // null
    // VIRUS

    // null
    // null

    // None of the other options

    public static void evaluate(Threat t) { //Line n5
        t = new Threat(); //Line n6
        t.name = "PHISHING"; //Line n7
    }
    
    public static void main(String[] args) {
        Threat obj = new Threat(); //Line n1
        obj.print(); //Line n2
        evaluate(obj); //Line n3
        obj.print(); //Line n4
    }
   
}

class Threat {
    String name = "VIRUS";
    
    public void print() {
        System.out.println(name);
    }
}
