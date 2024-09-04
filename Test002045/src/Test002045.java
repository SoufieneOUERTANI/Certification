public class Test002045 {
    public static void main(String[] args) throws Exception {

        String res = "";
        loop: for(var i = 1; i <= 5; i++) { //Line n1
            switch(i) {
            case 1:
                res += "UP ";
                break;
            case 2: 
                res += "TO ";
                break;
            case 3: 
                break;
            case 4:
                res += "DATE";
                break loop;
            }
        }
        System.out.println(String.join("-", res.split(" "))); //Line n2
    }
}
