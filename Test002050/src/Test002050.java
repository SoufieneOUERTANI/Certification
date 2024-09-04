public class Test002050 {

    int count;
    
    private static void increment(Test002050 counter) {
        counter.count++;
    }
    
    public static void main(String [] args) {
        Test002050 c1 = new Test002050();
        Test002050 c2 = c1;
        Test002050 c3 = null;
        c2.count = 1000;
        increment(c2);
    }

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    static int ObjectsCount=0; 
    Test002050(){
        System.out.println("Object Created : "+ ++ObjectsCount); 
    }

}
