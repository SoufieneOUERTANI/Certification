interface Logger {
    Object get();
    void log();
}
 
public class Test002082 {
    private static void testLogger(Logger logger) {
        logger.log();
    }
 
    public static void main(String[] args) {
        var obj = new Logger() { //Line n1
            @Override
            public Logger get() { //Line n2
                return this;
            }
            
            @Override
            public void log() {
                System.out.println("WINNERS NEVER QUIT"); //Line n3
            }
        };
        testLogger(obj.get()); //Line n4
    }
}
