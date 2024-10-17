public class Test003010 {
    Integer i = 10; //Line n1
    {
        Integer i = 2; //Line n2
    }
    public static void main(String[] args) { 
       System.out.println(new Test003010().i); //Line n3
    }
    { i--; } //Line n4
}
