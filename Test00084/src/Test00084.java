public class Test00084 {

    // What is the result of compiling and executing above code?

    // 97

    // 98

    // 98

    // 97

    // Compilation error

    // Runtime error

    public static void main(String[] args) {
        System.out.println(add(90, 7));
        System.out.println(add('a', 1)); //ASCII code for 'a' is 97 and 'b' is 98
    }
    
    public static var add(int v1, int v2) {
        return v1 + v2;
    }
}
