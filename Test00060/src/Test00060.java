public class Test00060 {

    // What is the result of compiling and executing Test class?

    // BEVERAGE

    // B.VERAGE

    // B.V.RAGE

    // B.V.RAG.

    // B.V.RAG..

    // Compilation error

    public static void main(String[] args) throws Exception {
        String str = "BEVERAGE";
        String [] arr = str.split("E", 3);
        System.out.println(String.join(".", arr));
        //>>>>>>>>>>>>>>
        arr = str.split("E");
        System.out.println(String.join(".", arr));
    }
}
