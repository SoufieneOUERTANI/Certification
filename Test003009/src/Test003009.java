public class Test003009 {
    final static StringBuilder sb = new StringBuilder("A");
    static int x = 2;
    public static void main(String[] args) {
        switch (x) {
            default: 
                sb.append("B"); //Line n1
            case 1:
            case 3: 
            case 5:
            case 7:
            case 9: 
                sb.append("C"); //Line n2
                break;
        }
        System.out.println(x + ":" + sb.toString()); //Line n3
    }
    static {
        sb.append("Z");
    }
    { x += 1; }
}
