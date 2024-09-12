public class Test002080 {
    public static void main(String [] args) {
        System.out.println(new Object() {
            public String toString() {
                return "ANONYMOUS";
            }
        });
    }
}