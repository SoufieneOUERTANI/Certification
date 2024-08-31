public class Test00069 {

    // What will be the result of compiling and executing Test class?

    // Java
    // Java
    // Java

    // Java
    // Java
    // <Some text containing @ symbol>

    // Java
    // <Some text containing @ symbol>
    // <Some text containing @ symbol>

    // null
    // Java
    // Java
    // Java

    // null
    // Java
    // Java
    // <Some text containing @ symbol>

    // null
    // Java
    // <Some text containing @ symbol>
    // <Some text containing @ symbol>

    // Java
    // Java
    // Java
    // null

    // Java
    // Java
    // <Some text containing @ symbol>
    // null
    
    // Java
    // <Some text containing @ symbol>
    // <Some text containing @ symbol>
    // null
    
    // null
    // Java
    // null
    // null


    public static void main(String[] args) {
        Object [] arr = new Object[4];
        for(int i = 1; i <=3; i++) {
            switch(i) {
                case 1: 
                    arr[i] = new String("Java");
                    break;
                case 2: 
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3: 
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for(Object obj : arr) {
            System.out.println(obj);
        }
    }
}

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}
