Sure! Let's break down the differences among these three assignments when `R` is a subclass of `P`.

---

### **1. `P p = new R();`**
- **Type of `p`:** `P` (the parent class)
- **Object being created:** `R` (the subclass)
- **Explanation:**
  - The **reference type** (`P`) determines which methods and properties can be accessed **at compile-time**. Only methods and properties defined in `P` (or inherited by `P`) are visible.
  - The **object type** (`R`) determines which method implementation is executed **at runtime**. This is due to **polymorphism** in Java.
  - If `R` overrides methods from `P`, the overridden methods in `R` will be executed.

- **Use case:** Commonly used in scenarios where you want to take advantage of polymorphism. You can write code that works with `P` objects but still uses behavior defined in subclasses like `R`.

---

### **2. `P p = new P();`**
- **Type of `p`:** `P` (the parent class)
- **Object being created:** `P` (the parent class itself)
- **Explanation:**
  - The **reference type** (`P`) and the **object type** (`P`) are the same.
  - No polymorphism is involved because there is no subclass object.
  - The methods and properties of `P` will be used both at **compile-time** and **runtime**.

- **Use case:** Used when you specifically want to work with objects of the parent class and do not need behavior from any subclasses.

---

### **3. `R p = new R();`**
- **Type of `p`:** `R` (the subclass)
- **Object being created:** `R` (the subclass)
- **Explanation:**
  - The **reference type** and **object type** are both `R`.
  - You have full access to all methods and properties defined in `R`, including those inherited from `P`.
  - No polymorphism is required because the reference and the object are of the same type.

- **Use case:** Used when you specifically need to work with `R` objects and want access to methods and properties unique to `R`.

---

### **Key Differences**

| Assignment         | Polymorphism | Accessible Methods | Executed Methods (Runtime) |
|---------------------|--------------|---------------------|----------------------------|
| `P p = new R();`    | Yes          | Methods in `P`      | Overridden methods in `R`  |
| `P p = new P();`    | No           | Methods in `P`      | Methods in `P`             |
| `R p = new R();`    | No           | Methods in `R`      | Methods in `R`             |

---

### **Summary**
- **`P p = new R();`**: Polymorphism. You can write generic code for `P` that can work with subclasses like `R`.
- **`P p = new P();`**: No polymorphism. Works strictly with parent class `P`.
- **`R p = new R();`**: Works directly with subclass `R` and provides full access to its methods and properties.

