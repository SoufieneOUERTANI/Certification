Merci pour le retour ! Je vais corriger l'exemple 3 pour refléter le fait que **l'appel `m(value)` fonctionne correctement avec la méthode `m(Integer)`**, comme démontré dans ton environnement Java.

Voici la version corrigée du texte :

---

## **1. Widening + Autoboxing : NON AUTORISÉ**

### Exemple (Erreur) :
```java
class Test {
    static void m(Double d) {
        System.out.println("m(Double)");
    }

    public static void main(String[] args) {
        m(5); // Erreur : pas de conversion implicite int → Double
    }
}
```

- **Erreur :**
  ```
  incompatible types: int cannot be converted to Double
  ```

- **Explication :**
  - `5` est un `int`. Java ne peut pas faire un **widening** (`int → double`) suivi d’un **autoboxing** (`double → Double`).

### Solution Corrigée :
Fournir directement un `double` comme argument, ou utiliser un **cast explicite**.

```java
class Test {
    static void m(Double d) {
        System.out.println("m(Double)");
    }

    public static void main(String[] args) {
        m((double) 5); // Cast explicite int → double, puis autoboxing double → Double
    }
}
```

- **Sortie :**
  ```
  m(Double)
  ```

---

## **2. Autoboxing + Widening : NON AUTORISÉ**

### Exemple (Erreur) :
```java
class Test {
    static void m(Object o) {
        System.out.println("m(Object)");
    }

    public static void main(String[] args) {
        // m(5.5); // Erreur : double → Object via autoboxing + widening non autorisé
    }
}
```

- **Erreur (si décommenté) :**
  ```
  incompatible types: double cannot be converted to Object
  ```

- **Explication :**
  - Java ne peut pas effectuer un **autoboxing** (`double → Double`) suivi d’un **widening** (`Double → Object`).

### Solution Corrigée :
Utiliser directement un **type wrapper** comme `Double`.

```java
class Test {
    static void m(Object o) {
        System.out.println("m(Object)");
    }

    public static void main(String[] args) {
        m(Double.valueOf(5.5)); // Conversion explicite double → Double
    }
}
```

- **Sortie :**
  ```
  m(Object)
  ```

---

## **3. Conversion entre Wrappers Incompatibles**

### Exemple (Fonctionnel, Correction Apportée) :
```java
class Test {
    static void m(Double d) {
        System.out.println("m(Double)");
    }

    static void m(Integer i) {
        System.out.println("m(Integer)");
    }

    public static void main(String[] args) {
        Integer value = 5;
        m(value); // Appelle m(Integer)
    }
}
```

- **Sortie :**
  ```
  m(Integer)
  ```

- **Explication :**
  - L'argument `value` est de type `Integer`, qui correspond **exactement** à la méthode `m(Integer i)`.
  - Java ne considère même pas la méthode `m(Double d)` car `Integer` ne peut pas être converti en `Double`.

### Cas Alternatif (Erreur avec `Double`) :
Si la méthode `m(Integer)` n’existe pas, l'appel provoquerait une erreur.

```java
class Test {
    static void m(Double d) {
        System.out.println("m(Double)");
    }

    public static void main(String[] args) {
        Integer value = 5;
        // m(value); // Erreur : pas de conversion implicite Integer → Double
    }
}
```

- **Erreur :**
  ```
  incompatible types: Integer cannot be converted to Double
  ```

---

## **4. Ambiguïté entre Autoboxing et Varargs**

### Exemple (Erreur) :
```java
class Test {
    static void m(Integer i) {
        System.out.println("m(Integer)");
    }

    static void m(int... args) {
        System.out.println("m(int...)");
    }

    public static void main(String[] args) {
        // m(5); // Erreur : Ambiguïté entre autoboxing et varargs
    }
}
```

- **Erreur (si décommenté) :**
  ```
  reference to m is ambiguous
  ```

- **Explication :**
  - Le compilateur hésite entre :
    - `m(Integer)` via autoboxing ;
    - `m(int...)` via varargs.

### Solution Corrigée :
Spécifier explicitement le type pour éviter l’ambiguïté.

```java
class Test {
    static void m(Integer i) {
        System.out.println("m(Integer)");
    }

    static void m(int... args) {
        System.out.println("m(int...)");
    }

    public static void main(String[] args) {
        m(Integer.valueOf(5)); // Autoboxing explicite pour éviter l'ambiguïté
    }
}
```

- **Sortie :**
  ```
  m(Integer)
  ```

---

## **5. Conversion Implicite vers une Sous-classe ou Interface**

### Exemple (Erreur) :
```java
class Test {
    static void m(Number n) {
        System.out.println("m(Number)");
    }

    static void m(Integer i) {
        System.out.println("m(Integer)");
    }

    public static void main(String[] args) {
        Number num = 5;
        m(num); // Appelle m(Number), pas de conversion implicite vers m(Integer)
    }
}
```

- **Sortie :**
  ```
  m(Number)
  ```

- **Explication :**
  - Bien que `num` contienne un `Integer`, Java ne tente pas de convertir implicitement `Number → Integer`.

### Solution Corrigée :
Casser l’ambiguïté avec un cast explicite.

```java
class Test {
    static void m(Number n) {
        System.out.println("m(Number)");
    }

    static void m(Integer i) {
        System.out.println("m(Integer)");
    }

    public static void main(String[] args) {
        Number num = 5;
        m((Integer) num); // Cast explicite Number → Integer
    }
}
```

- **Sortie :**
  ```
  m(Integer)
  ```

---

Cette correction assure que l'exemple 3 reflète fidèlement le comportement de Java en fonction des surcharges disponibles. Si tu souhaites explorer d'autres cas, je suis à ta disposition ! 😊