The key difference between a **normal inner class** and an **anonymous inner class** when dealing with multiple interfaces in Java is that a **normal inner class** can implement multiple interfaces, whereas an **anonymous inner class** can only implement a single interface (or extend a single class).

### 1. **Normal Inner Class (Can Implement Multiple Interfaces)**
A normal inner class is a named class defined within another class. It can implement multiple interfaces just like any regular class. Here’s an example:

```java
class OuterClass {
    class InnerClass implements Interface1, Interface2 {
        @Override
        public void method1() {
            System.out.println("Interface1 Method");
        }

        @Override
        public void method2() {
            System.out.println("Interface2 Method");
        }
    }
}
```

In this case, `InnerClass` is a normal inner class that implements both `Interface1` and `Interface2`.

### 2. **Anonymous Inner Class (Can Implement Only One Interface)**
An anonymous inner class is a class without a name, defined on-the-fly when you need to instantiate an object. Since it is an expression used to create an object, it can only extend one class or implement one interface at a time. Here’s an example of an anonymous inner class implementing a single interface:

```java
Interface1 obj = new Interface1() {
    @Override
    public void method1() {
        System.out.println("Anonymous class implementing Interface1");
    }
};
```

### Workaround for Multiple Interfaces with Anonymous Inner Classes
If you need to implement multiple interfaces with anonymous classes, you'll have to combine other techniques, such as:

- **Using Lambda Expressions (for Functional Interfaces):**
  If the interfaces are functional (having only one abstract method), lambda expressions can be an elegant solution for creating anonymous instances.

- **Use Composition:**
  You can create separate anonymous inner classes for each interface and compose them.

```java
Interface1 obj1 = new Interface1() {
    @Override
    public void method1() {
        System.out.println("Anonymous class for Interface1");
    }
};

Interface2 obj2 = new Interface2() {
    @Override
    public void method2() {
        System.out.println("Anonymous class for Interface2");
    }
};
```

To summarize:

- **Normal inner classes** can implement multiple interfaces.
- **Anonymous inner classes** are limited to implementing a single interface or extending a single class.
