public class Test002007 {
    public static void main(String[] args) throws Exception {

        // What will be the output of compiling and executing the Test class?

        // x is equal to 2

        // Compilation error
        
        // Still no idea what x is
        
        // x is equal to 1
        
        // Produces no output


        int x = 2;
        switch (x) {
            default:
                System.out.println("Still no idea what x is");
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
        }

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        System.out.println(">>>>>1 : Si pas break le block d'arpès s'exécute et ainsi de suite");

        switch (x) {
            default:
                System.out.println("Still no idea what x is");
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                // break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
        }

        System.out.println(">>>>>1 : Si pas break le block d'arpès s'exécute et ainsi de suite, meme le default");

        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                // break;   
            default:
                System.out.println("Still no idea what x is");
            case 3: 
                System.out.println("x is equal to 3");
                break;
        }


        System.out.println(">>>>>2 : Si un seul block autre que le default se déclenche, le default ne se déclenche pas automatiquement ");

        switch (x) {
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3: 
                System.out.println("x is equal to 3");
                break;
            default:
                System.out.println("Still no idea what x is");
        }

        System.out.println(">>>>>3 : Si le default se déclenche tout ce qui le suit se déclenche");

        switch (x) {
            default:
                System.out.println("Still no idea what x is");
            case 10:
                System.out.println("x is equal to 1");
                // break;
            case 20:
                System.out.println("x is equal to 2");
                break;
            case 30: 
                System.out.println("x is equal to 3");
                break;

        }
    }
}
