class Counter {
    static int ctr = 0;
    int count = 0;
}
 
public class Test003047 {

    // What will be the result of compiling and executing Test class?

    // Compilation error

    // 5:5 is printed on to the console
    
    // 15:15 is printed on to the console
    
    // 15:5 is printed on to the console

    public static void main(String[] args) {
        Counter ctr1 = new Counter();
        Counter ctr2 = new Counter();
        Counter ctr3 = new Counter();
        
        for(int i = 1; i <= 5; i++ ) {
            ctr1.ctr++;
            ctr1.count++;
            ctr2.ctr++;
            ctr2.count++;
            ctr3.ctr++;
            ctr3.count++;
        }
        
        System.out.println(ctr3.ctr + ":" + ctr3.count);
    }
}
