public class Test002046 {
    public static void main(String[] args) throws Exception {
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);
        }
    }
}
