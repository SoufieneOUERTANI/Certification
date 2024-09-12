interface Flyable {
    void fly();
}
 
public class Test002078 {
    public static void main(String[] args) {

        // Flyable flyable1 = new Flyable();

        // Flyable flyable2 = new Flyable(){};
        
        // Flyable flyable3 = new Flyable() {
        //     public void fly() {
        //         System.out.println("Flying high");
        //     }
        // }
        
        Flyable flyable4 = new Flyable() {
            public void fly() {
                System.out.println("Flying high");
            }
        };


        var flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying high");
            }
            
            public void stop() {
                System.out.println("Stopping");
            }
        };
            
        flyable.fly();
        flyable.stop();

    }
}


