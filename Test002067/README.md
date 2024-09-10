## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


Sure! Below are different code examples demonstrating various concepts related to **inner classes** in Java. I'll cover **member inner classes**, **static nested classes**, **local inner classes**, and **anonymous inner classes**.


Sure! Here are different concepts of **inner classes** in Java, along with code examples that illustrate what is possible and common errors to avoid.

### 1. **Member Inner Class (Non-static inner class)**

A **member inner class** is a non-static class defined inside another class. It can access the outer class's fields, including private ones.

#### Working Example:
```java
class OuterClass {
    private String message = "Hello from Outer Class";

    // Member Inner Class
    class InnerClass {
        public void displayMessage() {
            System.out.println(message); // Accessing outer class private field
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass(); // Correct way to instantiate
        inner.displayMessage();
    }
}
```

#### Error to Avoid:
- **Error:** Trying to instantiate the inner class without an instance of the outer class.
  
```java
public class Main {
    public static void main(String[] args) {
        // Compilation error: Non-static inner class cannot be referenced without an outer class instance
        OuterClass.InnerClass inner = new OuterClass.InnerClass(); 
    }
}
```

#### Solution:
- Always instantiate the inner class using an instance of the outer class.
```java
OuterClass.InnerClass inner = outer.new InnerClass(); 
```

---

### 2. **Static Nested Class**

A **static nested class** behaves like a regular class, but it is scoped inside another class. It can only access the static members of the outer class.

#### Working Example:
```java
class OuterClass {
    private static String staticMessage = "Hello from Static Outer Class";

    // Static Nested Class
    static class StaticNestedClass {
        public void displayMessage() {
            System.out.println(staticMessage); // Can only access static members
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // No need for an outer class instance
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.displayMessage();
    }
}
```

#### Error to Avoid:
- **Error:** Trying to access non-static members of the outer class from a static nested class.
```java
class OuterClass {
    private String message = "Hello from Outer Class";

    static class StaticNestedClass {
        public void displayMessage() {
            // Compilation error: Non-static member 'message' cannot be accessed in a static context
            System.out.println(message);
        }
    }
}
```

#### Solution:
- Only access static members from a static nested class.
```java
private static String staticMessage = "Static Message";
```

---

### 3. **Local Inner Class**

A **local inner class** is defined within a method or a block. It can access local variables of the method, but only if they are declared `final` or are **effectively final**.

#### Working Example:
```java
class OuterClass {
    public void createLocalInnerClass() {
        final String message = "Hello from Local Inner Class";

        // Local Inner Class inside a method
        class LocalInnerClass {
            public void displayMessage() {
                System.out.println(message); // Accessing local variable
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        inner.displayMessage();
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createLocalInnerClass();
    }
}
```

#### Error to Avoid:
- **Error:** Modifying a local variable after it is accessed by the inner class.
```java
class OuterClass {
    public void createLocalInnerClass() {
        String message = "Hello";

        class LocalInnerClass {
            public void displayMessage() {
                System.out.println(message); // This works fine
            }
        }

        message = "Hello Again"; // Error: Local variable must be final or effectively final
    }
}
```

#### Solution:
- Either declare the variable `final` or make sure it is not modified after its initial assignment.
```java
final String message = "Hello from Local Inner Class";
```

---

### 4. **Anonymous Inner Class**

An **anonymous inner class** is a class without a name, typically used to implement an interface or extend a class on the fly.

#### Working Example:
```java
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        // Anonymous inner class implementing an interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };

        greeting.sayHello();
    }
}
```

#### Error to Avoid:
- **Error:** Forgetting to override the method when using an anonymous class.

```java
// Error: No method is overridden, and greeting.sayHello() is undefined
Greeting greeting = new Greeting() {
    // Forgot to override sayHello method
};

greeting.sayHello(); // Compilation error
```

#### Solution:
- Always override the necessary methods when implementing an anonymous inner class.

---

### 5. **Inner Class Accessing Outer Class Members**

An inner class can access the outer class's members (even private ones), but there may be naming conflicts. Use `OuterClass.this` to refer to outer class members explicitly.

#### Working Example:
```java
class OuterClass {
    private String message = "Outer Class Message";

    class InnerClass {
        private String message = "Inner Class Message"; // Name conflict

        public void printMessages() {
            System.out.println(message); // Inner class message
            System.out.println(OuterClass.this.message); // Outer class message
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printMessages();
    }
}
```

#### Error to Avoid:
- **Error:** Forgetting to differentiate between the outer and inner class fields when they have the same name.

```java
class InnerClass {
    private String message = "Inner Class Message"; // Shadows outer class's message
    public void printMessages() {
        System.out.println(message); // Prints inner class message only
    }
}
```

#### Solution:
- Use `OuterClass.this.<field>` to refer to the outer class field explicitly.

```java
System.out.println(OuterClass.this.message); // Refers to outer class's message
```

---

### 6. **Shadowing Outer Class Variables**

When an inner class has a member variable with the same name as the outer class, this causes **shadowing**. The inner class's member hides the outer class member.

#### Example:
```java
class OuterClass {
    int x = 10;

    class InnerClass {
        int x = 20; // Shadows the outer class's variable

        void printX() {
            System.out.println(x);              // Prints 20 (inner class's x)
            System.out.println(OuterClass.this.x); // Prints 10 (outer class's x)
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.printX();
    }
}
```

---

### 7. **Static Context in Inner Classes**

Static nested classes cannot access non-static members of the outer class.

#### Working Example:
```java
class OuterClass {
    private static String staticMessage = "Hello from Static Message";

    static class StaticNestedClass {
        public void printStaticMessage() {
            System.out.println(staticMessage); // Can access static fields
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.printStaticMessage();
    }
}
```

#### Error to Avoid:
- **Error:** Trying to access non-static members of the outer class from a static nested class.

```java
class OuterClass {
    private String nonStaticMessage = "Non-static message";

    static class StaticNestedClass {
        public void printMessage() {
            // Compilation error: Cannot access non-static field 'nonStaticMessage'
            System.out.println(nonStaticMessage);
        }
    }
}
```

#### Solution:
- Only access static members from a static nested class, or pass an instance of the outer class.

```java
private static String staticMessage = "Static Message";
```

Alternatively, you can pass an instance of the outer class to access non-static members.

---

### Conclusion

- **Member Inner Classes** can access all outer class members but require an instance of the outer class.
- **Static Nested Classes** can only access static members of the outer class.
- **Local Inner Classes** require local variables to be final or effectively final.
- **Anonymous Inner Classes** are commonly used to implement interfaces or extend classes but must override necessary methods.
- **Shadowing** occurs when an inner class variable has the same name as an outer class variable.
- **Static Contexts** within static nested classes can only access static members of the outer class.