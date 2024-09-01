public class Test002013 {
    public static void main(String[] args) throws Exception {

        // What will be the result of compiling and executing Test class?

        // CHAIR

        // SOFA
        
        // SOFA
        // BED
        
        // CHAIR
        // RECLINER
        // SOFA
        // BED

        String furniture = new String(new char[] {'S', 'o', 'f', 'a'});
        switch (furniture) {
            default:
                System.out.println("CHAIR");
            case "Recliner":
                System.out.println("RECLINER");
            case "Sofa":
                System.out.println("SOFA");
            case "Bed":
                System.out.println("BED");
                break;
        }
    }
}
