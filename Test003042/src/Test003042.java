public class Test003042 {

    // What will be the result of compiling and executing TestMessage class?

    // null
    // NEVER LOOK BACK!

    // NEVER LOOK BACK!
    // NEVER LOOK BACK!

    // null
    // null

    // LET IT GO!
    // NEVER LOOK BACK!

    // LET IT GO!
    // LET IT GO!

    // Compilation error

    public static void change(Message m) { //Line n5
        m.msg = "NEVER LOOK BACK!"; //Line n6
    }
    
    public static void main(String[] args) {
        Message obj = new Message(); //Line n1
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4
    }
}

class Message {
    String msg = "LET IT GO!";
    
    public void print() {
        System.out.println(msg);
    }
}
