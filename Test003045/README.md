The correct answer is:

**`public Planet(String str) {}`**

### Explanation:
1. **What is a constructor in Java?**
   - A constructor is a special method used to initialize objects.
   - It must have the **same name as the class**.
   - It **must not have a return type**, not even `void`.

2. **Analyzing each option:**
   - **`public void Planet() {}`**  
     - **Not a constructor.** This is a regular method because it has the return type `void`. Constructors cannot have a return type.

   - **`public void Planet(int x) {}`**  
     - **Not a constructor.** Similar to the above, it has the return type `void`, making it a regular method.

   - **`public Planet(String str) {}`**  
     - **Valid constructor.** It matches the class name `Planet` and has no return type, making it a valid constructor that takes a `String` argument.

   - **`None of the other options`**  
     - Incorrect because `public Planet(String str)` is a valid constructor.

### Final Answer:
**`public Planet(String str) {}`**