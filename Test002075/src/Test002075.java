class Printer {
    public void getType() {
        System.out.println("LASER");
    }
}
 
public class Test002075 {
    public static void main(String[] args) {
        Printer obj1 = new Printer() { //Line n1
            public void GetType() { //Line n2
                System.out.println("INKJET");
            }
        };
        obj1.GetType(); //Line n3

        Object obj2 = new Printer() { //Line n1
            public void GetType() { //Line n2
                System.out.println("INKJET");
            }
        };
        obj2.GetType(); //Line n3
        
        var obj3 = new Printer() { //Line n1
            public void GetType() { //Line n2
                System.out.println("INKJET");
            }
        };
        obj3.GetType(); //Line n3
    }
} 
