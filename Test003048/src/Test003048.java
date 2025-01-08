public class Test003048 {
    static int i1 = 10;
    int i2 = 20;
    
    int add() {
        return this.i1 + this.i2; //Line n1
    }
    
    public static void main(String[] args) {
        System.out.println(new Test().add()); //Line n2
    }
}