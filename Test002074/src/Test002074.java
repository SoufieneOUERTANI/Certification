class Logger {
    public void log() {
        System.out.println("GO FOR IT");
    }
}
 
public class Test002074 {
    public static void main(String[] args) {
        Logger obj = new Logger() {
            public void Log() {
                System.out.println("LET IT BE");
            }
        };
        obj.Log();
    }
}