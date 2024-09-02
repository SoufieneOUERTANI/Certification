public class Test002033 {
    public static void main(String[] args) throws Exception {
        // var: while (true) { //Line n1
        //     i: for (int i = 0; i <= 2; i++) {
        //         if(i == 2) {
        //             /*INSERT*/
        //         }
        //     }
        // }
        // System.out.println("THINK DIFFERENT"); //Line n2

//                 var1: while (true) { //Line n1
//             i1: for (int i1 = 0; i1 <= 2; i1++) {
//                 if(i1 == 2) {
// continue;
//                 }
//             }
//         }
//         System.out.println("THINK DIFFERENT"); //Line n2



//         var2: while (true) { //Line n1
//             i2: for (int i2 = 0; i2 <= 2; i2++) {
//                 if(i2 == 2) {
// continue i2;
//                 }
//             }
//         }
//         System.out.println("THINK DIFFERENT"); //Line n2



//          var3: while (true) { //Line n1
//             i3: for (int i3 = 0; i3 <= 2; i3++) {
//                 if(i3 == 2) {
// continue var3;
//                 }
//             }
//         }
//         System.out.println("THINK DIFFERENT"); //Line n2



//         var4: while (true) { //Line n1
//             i4: for (int i4 = 0; i4 <= 2; i4++) {
//                 if(i4 == 2) {
// break;
//                 }
//             }
//         }
//         System.out.println("THINK DIFFERENT"); //Line n2



//         var5: while (true) { //Line n1
//             i5: for (int i5 = 0; i5 <= 2; i5++) {
//                 if(i5 == 2) {
// break i5;
//                 }
//             }
//         }
//         System.out.println("THINK DIFFERENT"); //Line n2


        var6: while (true) { //Line n1
            i6: for (int i6 = 0; i6 <= 2; i6++) {
                if(i6 == 2) {
break var6;                }
            }
        }
        System.out.println("THINK DIFFERENT"); //Line n2


    }
}
