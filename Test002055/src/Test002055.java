public class Test002055 {
    public static void main(String[] args) {
        new NewsPaper(); //Line n1
        NewsPaper p = new NewsPaper(); // Line n2
        change(p); //Line n3
        System.out.println("About to end."); //Line n4
    }
    
    public static void change(NewsPaper np) { //Line n5
        np = new NewsPaper(); //Line n6
    }
}

class NewsPaper {
    
}
