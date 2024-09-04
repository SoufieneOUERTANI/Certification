public class Test002043 {
    public static void main(String[] args) throws Exception {
        var res = ""; //Line n1
        String [] arr = {"Dog", null, "Friendly"};
        for(String s : arr) { //Line n2
            res += String.join("-", s); //Line n3
        }
        System.out.println(res); //Line n4

    }
}
