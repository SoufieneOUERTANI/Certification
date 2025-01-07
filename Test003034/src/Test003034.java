import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test003034 {
    String name = "";

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public void Test003034(String name) {
        this.name = name;
    }

    public void Test003034(String... sports) {
        name = String.join(",", sports);
    }

    public String Test003034() {
        return name;
    }

    public Test003034() {
        name = "";
    }

    public Test003034(String name) {
        this.name = name;
    }
    
    public Test003034(String name1, String name2) {
        name = String.join(",", name1, name2);
    }
}
