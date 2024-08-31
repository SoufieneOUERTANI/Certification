public class Test00062 {

    // What is the result?

    // false:true
    // false:false
    
    // false:false
    // false:true
    
    // false:false
    // false:false
    
    // false:true
    // false:true

    // false:true
    // true:true
    
    // true:true
    // true:true
    
    // false:false
    // true:true

    public static void main(String[] args) throws Exception {
        String str1 = "Book"; //Line n1
        String str2 = new String(new char[] {'B', 'o', 'o', 'k'}); //Line n2
        String str3 = new String("Book"); //Line n3
        System.out.println((str1 == str2) + ":" + (str1 == str2.intern())); //Line n4
        System.out.println((str2 == str3) + ":" + (str2.intern() == str3.intern())); //Line n5
    }
}
