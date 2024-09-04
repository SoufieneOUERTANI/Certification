public class Test002054 {
    public static void main(String[] args) throws Exception {
        Test002054 p1 = new Test002054(); //Line n1
        Test002054 p2 = new Test002054(); //Line n2
        p1 = p2; //Line n3
        p1 = null; //Line n4
    }
}
