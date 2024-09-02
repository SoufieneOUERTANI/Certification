public class Test002034 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for(var i = 0; i < 7; i++) { //Line n1
            if(i == 4)
                break;
            else
                continue;
            sum += i; //Line n2
        }
        System.out.println(sum); //Line n3
    }
}
