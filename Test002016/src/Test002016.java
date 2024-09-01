public class Test002016 {
    public static void main(String[] args) throws Exception {

        // For the class Test, which of the following options, if used to replace /*INSERT*/, will print "BUY 2 GET 1 FREE" on to the console?

        // int day = 3;

        // Integer day = 3;
        
        // int day = '3';
        
        // None of the other options


        int day1 = 3;
        switch(day1) {
            case '3':
                System.out.println("BUY 2 GET 1 FREE");
                break;
            default:
                System.out.println("SORRY!!! NO SALE");
        }

        // // Type mismatch: cannot convert from char to Integer
        // Integer day2 = 3;
        // switch(day2) {
        //     case '3':
        //         System.out.println("BUY 2 GET 1 FREE");
        //         break;
        //     default:
        //         System.out.println("SORRY!!! NO SALE");
        // }

        int day3 = '3';
        switch(day3) {
            case '3':
                System.out.println("BUY 2 GET 1 FREE");
                break;
            default:
                System.out.println("SORRY!!! NO SALE");
        }
    }
}
