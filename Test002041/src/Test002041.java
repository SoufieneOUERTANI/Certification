public class Test002041 {
    public static void main(String[] args) throws Exception {
        int i = 0;
        String res = null;
        for(String [] s = {"A", "B", "C", "D"};;res = String.join(".", s)) { //Line n1
            if(i++ == 0)
                continue;
            else
                break;
        }
        System.out.println(res); //Line n2
    }
}
