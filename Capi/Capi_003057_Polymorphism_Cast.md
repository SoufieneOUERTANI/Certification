Voici les **règles générales** concernant les **erreurs de compilation** et les **erreurs d'exécution (runtime)** dans les cas de **polymorphisme** et de **cast**, accompagnées d'exemples illustratifs.

---

## **1. Règles générales pour le polymorphisme et le cast**

### **1.1 Polymorphisme**
- **Règle 1** : Une **référence de type parent** peut pointer vers un **objet de type enfant**.
    ```java
    Parent p = new Child(); // Valide
    ```

- **Règle 2** : Une **référence de type enfant** ne peut pas pointer vers un **objet de type parent** sans un **cast explicite**.
    ```java
    Child c = (Child) new Parent(); // Nécessite un cast explicite
    ```

- **Règle 3** : Lorsqu'on utilise une référence de type parent, seules les méthodes et champs disponibles dans le **type de référence** sont accessibles à la compilation. Cependant, les **méthodes overridées** de l'objet réel sont exécutées à l'exécution (**polymorphisme dynamique**).

    Exemple :
    ```java
    class Parent {
        void print() {
            System.out.println("Parent");
        }
    }
    class Child extends Parent {
        void print() {
            System.out.println("Child");
        }
    }

    Parent p = new Child();
    p.print(); // Compile, exécute "Child" (méthode de l'objet réel)
    ```

---

### **1.2 Cast**
- **Règle 1** : Si une référence parent pointe vers un objet enfant, elle peut être **castée** explicitement vers le type enfant.
    ```java
    Parent p = new Child();
    Child c = (Child) p; // Valide
    ```

- **Règle 2** : Si une référence parent pointe vers un objet parent, tenter de la caster vers un type enfant provoque une **`ClassCastException`** à l'exécution.
    ```java
    Parent p = new Parent();
    Child c = (Child) p; // Compile, mais erreur runtime : ClassCastException
    ```

- **Règle 3** : Le **compilateur n'autorise pas les cast non compatibles** directement (par exemple, cast entre classes sans relation d'héritage).
    ```java
    String s = (String) new Integer(5); // Erreur de compilation
    ```

---

## **2. Erreurs de compilation : Règles et exemples**

### **2.1 Cast incompatible non détectable à la compilation**
- Le compilateur autorise un **cast explicite** entre des classes liées par l'héritage, mais il ne garantit pas que l'objet réel est du bon type.

#### Exemple valide à la compilation, mais problème à l'exécution :
```java
class Parent {}
class Child extends Parent {}

Parent p = new Parent();
Child c = (Child) p; // Compile, mais provoque ClassCastException à l'exécution
```

---

### **2.2 Cast incompatible détecté à la compilation**
- Le compilateur empêche les **casts non compatibles** entre classes qui n'ont pas de relation d'héritage.

#### Exemple :
```java
class Parent {}
class Child extends Parent {}

String s = (String) new Parent(); // Erreur de compilation : types incompatibles
```

---

### **2.3 Polymorphisme et accès aux membres**
- Lors de l'accès aux membres via une référence polymorphique, **le type de référence détermine les membres accessibles** à la compilation.

#### Exemple :
```java
class Parent {
    void print() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void childSpecificMethod() {
        System.out.println("Child-specific");
    }
}

Parent p = new Child();
p.childSpecificMethod(); // Erreur de compilation : méthode non définie dans Parent
```

---

## **3. Erreurs à l'exécution : Règles et exemples**

### **3.1 ClassCastException**
- Se produit lorsqu'un objet est casté vers un type auquel il n'appartient pas.

#### Exemple :
```java
class Parent {}
class Child extends Parent {}

Parent p = new Parent();
Child c = (Child) p; // Runtime error : ClassCastException
```

---

### **3.2 NullPointerException**
- Si une référence polymorphique est `null` et que vous tentez d'appeler une méthode dessus, une **`NullPointerException`** est levée.

#### Exemple :
```java
Parent p = null;
p.print(); // Runtime error : NullPointerException
```

---

### **3.3 Polymorphisme dynamique**
- Une méthode overridée dans une classe enfant est appelée même si la référence est de type parent, ce qui peut causer des erreurs si l'objet n'est pas du type attendu.

#### Exemple :
```java
class Parent {
    void print() {
        System.out.println("Parent");
    }
}
class Child extends Parent {
    void print() {
        System.out.println("Child");
    }
}

Parent p = new Parent();
Child c = (Child) p; // Runtime error : ClassCastException
```

---

## **Résumé des règles et best practices**

| **Type de problème**                     | **Exemple**                                                                                     | **Solution**                                                                                     |
|------------------------------------------|-------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| **Cast valide à la compilation mais erreur runtime** | `Parent p = new Parent(); Child c = (Child) p;`                                                | Vérifier avec `instanceof` avant de caster : `if (p instanceof Child)`                          |
| **Cast non compatible à la compilation** | `String s = (String) new Parent();`                                                            | Assurez-vous que les classes ont une relation d'héritage ou d'implémentation.                   |
| **Accès aux membres polymorphiques**     | `Parent p = new Child(); p.childSpecificMethod();`                                              | Utilisez le type réel ou castez la référence après vérification avec `instanceof`.              |
| **NullPointerException**                 | `Parent p = null; p.print();`                                                                  | Toujours vérifier si une référence est `null` avant d'accéder à ses membres.                    |

---

Ces règles vous aideront à comprendre et éviter les erreurs liées au **polymorphisme** et au **cast** en Java. Si vous avez des cas spécifiques, n'hésitez pas à demander ! 😊