public class Test003053 {
    public static void main(String[] args) {
        P p = new R(); //Line n1
        System.out.println(p.compute("Go")); //Line n2
    }
}
 
class P {
    String compute(String str) {
        return str.repeat(3);
    }
}
 
class Q extends P {
    String compute(String str) {
        return super.compute(str.toLowerCase());
    }
}
 
class R extends Q {
    String compute(String str) {
        return super.compute(str.replace('o', 'O'));
 //2nd argument is uppercase O
    }
}


// What will be the result of compiling and executing above code?

// gogogo

// GoGoGo

// GOGOGO

// Go

// GO

// go