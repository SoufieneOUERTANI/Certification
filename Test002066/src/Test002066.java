class Outer {
    Outer() {
        System.out.print(2);
    }
    {System.out.print(1);}
    static {System.out.print(1);}
        class Inner {
        Inner() {
            System.out.print(4);
        }
        {System.out.print(3);}
        // static {System.out.print(3);}    
    }
}
 
public class Test002066 {
    public static void main(String[] args) {
        new Outer().new Inner();
    }
}

// Replace /*INSERT 1*/ with {System.out.print(1);}
// Replace /*INSERT 2*/ with {System.out.print(3);}

// Replace /*INSERT 1*/ with static {System.out.print(1);}
// Replace /*INSERT 2*/ with {System.out.print(3);}

// Replace /*INSERT 1*/ with {System.out.print(1);}
// Replace /*INSERT 2*/ with static {System.out.print(3);}

// Replace /*INSERT 1*/ with static {System.out.print(1);}
// Replace /*INSERT 2*/ with static {System.out.print(3);}

// >>>>>>>>>>>>>>>>>>>>>>>

// which exexution sequence does the code flow, follow in java language ? static, main, instance, constructor, etc, .. ?

// - Static blocks and static variables are executed when the class is loaded (in the order they appear).
// - The main() method is executed after all static blocks and static variables are initialized.
// - If an object is created, instance blocks and instance variables are initialized before the constructor.
// - The constructor is executed when an object is created.
// - Methods are called after object creation as needed.

// Static block 1
// Static variable initialized
// Static block 2
// Main method executed
// Instance block executed
// Instance variable initialized
// Constructor executed
// Method executed