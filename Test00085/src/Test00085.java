public class Test00085 {
    // Which of the following options, if used to replace /*INSERT*/, will compile successfully and on execution will print 90 on to the console?
    // Select 3 options.

    // byte

    // short

    // int

    // long

    // float

    // double

    // var



    public static void main(String[] args) throws Exception {
        var m = 10; //Line n1
        var n = 20; //Line n2
        // /*INSERT*/ p = m = n = 30; //Line n3
        // System.out.println(m + n + p); //Line n4

        // >>>>>>>>>>>>>

        // // Type mismatch: cannot convert from int to byte
        // byte p1 = m = n = 30; //Line n3
        // System.out.println(m + n + p1); //Line n4

        // // Type mismatch: cannot convert from int to short
        // short p2 = m = n = 30; //Line n3
        // System.out.println(m + n + p2); //Line n4

        int p3 = m = n = 30; //Line n3
        System.out.println(m + n + p3); //Line n4

        long p4 = m = n = 30; //Line n3
        System.out.println(m + n + p4); //Line n4

        float p5 = m = n = 30; //Line n3
        System.out.println(m + n + p5); //Line n4

        double p6 = m = n = 30; //Line n3
        System.out.println(m + n + p6); //Line n4

        var p7 = m = n = 30; //Line n3
        System.out.println(m + n + p7); //Line n4
    }
}
