public class Test00081 {

    // Which of the following code segments, written inside main method will compile successfully?
    // Select 3 options.  
    public static void main(String[] args) throws Exception {
        // // 'var' is not allowed as an element type of an arrayJava(1073743325)
        // var [] arr1 = new String[2];

        // // Cannot use 'var' on variable without initializerJava(1073743327)
        // var num;
        // num = 10;
        
        final var str = "Hello";
        
        // // Array initializer needs an explicit target-type
        // var arr2 = {1, 2, 3};
        
        for (var i = 0; i <2; i++) {
        System.out.println(i);
        
        }
        
        String [] arr = {"A", "E", "I", "Oo", "U"};
        for(var x : arr) {
        System.out.println(x);
        }

        var msg = null;

        // private var y = 100;

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        // // Line 1:
        // var [] arr1 = new String[2];
        // // This will not compile because the syntax is incorrect. The var keyword cannot be used with array brackets before the variable name. The correct syntax would be:
        // var arr1 = new String[2];
        // // or
        // String[] arr1 = new String[2];

        // // Line 2-3:
        // var num;
        // num = 10;
        // // This will not compile because the variable num is declared with var without being initialized. The var keyword requires the variable to be initialized at the point of declaration so that the compiler can infer its type.
    
        // // Line 6:
        // var arr2 = {1, 2, 3}; 
        // // This will not compile because var cannot be used with an array initializer without specifying an explicit type. The correct syntax would be:
        // int[] arr2 = {1, 2, 3};
        // // or
        // var arr2 = new int[]{1, 2, 3};
    
    
        // // Line 18:
        // private var y = 100;
        // // This will not compile because var cannot be used with member variables (i.e., instance or class variables). var can only be used for local variables inside methods, loops, or blocks.    
    
    }
}
