public class Test002011 {
    public static void main(String[] args) throws Exception {

        What will be the result of compiling and executing Test class?

        // MANGO

        // ANY FRUIT WILL DO

        // MANGO
        // BANANA

        // MANGO
        // ANY FRUIT WILL DO

        // MANGO
        // BANANA
        // ANY FRUIT WILL DO

        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }
    }
}
