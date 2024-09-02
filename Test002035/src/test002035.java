public class test002035 {
    public static void main(String[] args) throws Exception {
        int elements = 0;
        Object [] arr = {"A", "E", "I", new Object(), "O", "U"}; //Line n1
        for(var obj : arr) { //Line n2
            if(obj instanceof String) {
                continue;
            } else {
                break;
            }
            elements++; //Line n3
        }
        System.out.println(elements); //Line n4

    }
}
