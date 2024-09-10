public class Test002067 {

    // What will be the result of compiling and executing Test class?


    public static void main(String[] args) throws Exception {
        new Outer().print(100);
    }
}

class Outer {
    final int z = 3;
    int w = 3;
    public void print(int x) {
        class Inner {
            int y = 0;
            public void getX() {
                // System.out.println(++x); // Illegal accept, should be effectively final
                // >>>>>>>>>>>>>>>>>>>>>>>>>
                System.out.println(w); // effectively final 
                System.out.println(z); // final
                System.out.println(y++); // inside the inner class
            }
        }
        Inner inner = new Inner();
        inner.getX();
    }
}


// Characteristics of Local Inner Classes:
// Scope: The local inner class is only accessible within the method or block in which it is defined. It cannot be accessed outside of that scope.

// Visibility: You cannot use access modifiers (like public, private, etc.) with local inner classes.

// Access to Variables: Local inner classes can access the local variables of the method, but only if those variables are marked as final (before Java 8) or are effectively final (after Java 8).

// Example:

// public void someMethod() {
//     final int localVar = 10;
//     class LocalInnerClass {
//         void display() {
//             System.out.println(localVar); // Can access final or effectively final variables
//         }
//     }
// }
// Instantiated within the method: The local inner class can only be instantiated within the method where it is declared.

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



// - In Java, can a class be inside an  method(instance or static) ?

// In Java, **a class can be declared inside a method**, and such a class is known as a **local inner class**. However, it can only exist within the scope of that method. Local inner classes can be declared inside both instance methods and static methods. Here’s how they work:

// ### Local Inner Class (Inside a Method)

// A **local inner class** is a class defined inside a method, constructor, or block of code. This class is local to that method and can only be instantiated and used within it. It can't be accessed outside the method in which it is defined.

// ### Example in an Instance Method:
// public class OuterClass {
//     public void instanceMethod() {
//         // Local Inner Class inside an instance method
//         class LocalInnerClass {
//             void display() {
//                 System.out.println("Inside local inner class of instance method");
//             }
//         }
        
//         LocalInnerClass inner = new LocalInnerClass();
//         inner.display();
//     }

//     public static void main(String[] args) {
//         OuterClass outer = new OuterClass();
//         outer.instanceMethod(); // Invoke instance method containing the local inner class
//     }
// }

// **Output:**
// Inside local inner class of instance method

// ### Example in a Static Method:
// public class OuterClass {
//     public static void staticMethod() {
//         // Local Inner Class inside a static method
//         class LocalInnerClass {
//             void display() {
//                 System.out.println("Inside local inner class of static method");
//             }
//         }
        
//         LocalInnerClass inner = new LocalInnerClass();
//         inner.display();
//     }

//     public static void main(String[] args) {
//         OuterClass.staticMethod(); // Invoke static method containing the local inner class
//     }
// }

// **Output:**
// Inside local inner class of static method

// ### Characteristics of Local Inner Classes:
// 1. **Scope:** The local inner class is only accessible within the method or block in which it is defined. It cannot be accessed outside of that scope.
// 2. **Visibility:** You cannot use access modifiers (like `public`, `private`, etc.) with local inner classes.
// 3. **Access to Variables:** Local inner classes can access the local variables of the method, but only if those variables are marked as `final` (before Java 8) or are **effectively final** (after Java 8).
   
//    Example:
//    public void someMethod() {
//        final int localVar = 10;
//        class LocalInnerClass {
//            void display() {
//                System.out.println(localVar); // Can access final or effectively final variables
//            }
//        }
//    }

// 4. **Instantiated within the method:** The local inner class can only be instantiated within the method where it is declared.

// ### Conclusion:
// Yes, a class **can** be inside a method, and such a class is called a **local inner class**. It can be defined in either an instance method or a static method but is restricted to that method's scope.
 
