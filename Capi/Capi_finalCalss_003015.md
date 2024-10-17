In Java, a `final` class is one that **cannot be subclassed or extended**. This means that no other class can inherit from a `final` class. Here are some of the key purposes and benefits of using a `final` class:

1. **Security and Immutability**: Declaring a class as `final` ensures that its behavior cannot be altered through inheritance. This is useful for creating immutable classes, such as `String`, where you don't want its internal state or behavior to be changed via subclassing.
   
2. **Performance Optimization**: The Java compiler and the JVM can make certain optimizations when dealing with `final` classes because they know that no subclasses will exist. This might result in slightly improved performance, although the impact is often minor.

3. **Preventing Inheritance**: Sometimes you might design a class with the intention that it should not be subclassed, either because subclassing it could lead to incorrect usage or because the class is not designed for inheritance. Marking the class as `final` enforces this.

For example:

```java
public final class MyFinalClass {
    // Class content
}

// This would result in a compilation error
public class SubClass extends MyFinalClass {
    // Not allowed
}
```

In summary, a `final` class is used when you want to protect the integrity of a class by preventing it from being subclassed or to ensure consistent and secure behavior.