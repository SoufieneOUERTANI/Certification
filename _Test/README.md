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


## Output :

### La première chose qui s'exécute dans une arborescence de classes, c'est :
- Tous les blocks static du père vers le fils.
Ensuite objet par objet du père vers le fils :
- Les blocks et les variables d'instance
- Le constructeur

### Conclusion chatgpt :

Ce programme illustre plusieurs concepts clés de l'exécution en Java, notamment les blocs statiques, les blocs d'initialisation d'instance, les constructeurs, et l'ordre d'exécution dans un contexte de classes héritées. Voici les conclusions que l'on peut tirer de l'exécution du code :

### 1. **Chargement de la classe `CombinedExample` et exécution des blocs statiques**
   - Lors de l'exécution, la première chose qui se produit est le chargement de la classe `CombinedExample`. Cela déclenche les **blocs statiques** dans l'ordre où ils apparaissent.
   - L'ordre d'exécution des blocs statiques est le suivant :
     - `Static block 1, CombinedExample`
     - `Static variable initialized, CombinedExample` (le bloc de méthode statique `initializeStaticVar` est appelé pour initialiser `staticVar`)
     - `Static block 2, CombinedExample`
     - `Static block 3, CombinedExample`

### 2. **Création d'une instance de la classe `Sub`**
   Lors de la création d'une instance de la sous-classe `Sub`, plusieurs étapes se produisent dans cet ordre :
   - **Chargement de la classe `Super`** (la superclasse de `Sub`), ce qui déclenche le **bloc statique de `Super`** :
     - `1, Super, static`
   - Ensuite, les **blocs statiques de `Sub`** sont exécutés :
     - `2, Sub, static`
     - `3, Sub, static`
   - Lors de l'instanciation de `Sub`, l'exécution se déroule ainsi :
     - Les **blocs d'initialisation d'instance** de `Super` sont exécutés avant son constructeur :
       - `A, Super, instance`
       - `B, Super, instance`
     - Le **constructeur de `Super`** est appelé via `super(str)` :
       - `Z, Super, constructor`
     - Les **blocs d'initialisation d'instance** de `Sub` sont ensuite exécutés :
       - `C, Sub, instance bloc`
     - Enfin, le **constructeur de `Sub`** termine :
       - `Z, Sub, constructor`

### 3. **Exécution de la méthode statique `MyClass.staticMethod`**
   - Avant que la méthode statique ne soit appelée, la classe `MyClass` est chargée, ce qui déclenche l'exécution de son **bloc statique** :
     - `Static block: MyClass is loaded`
   - Ensuite, la méthode statique est appelée :
     - `Static method: MyClass Executed without an object`

### 4. **Création d'une instance de `MyClass`**
   - Lors de la création d'une instance de `MyClass`, les blocs d'initialisation et le constructeur s'exécutent :
     - `Instance initializer block: MyClass object is being created`
     - `Constructor: MyClass object is fully created`
   - La méthode d'instance est ensuite appelée :
     - `Instance method: MyClass Executed by an object`

### 5. **Exemple de contrôle de flux dans `MyClass`**
   - La méthode `controlFlowExample` illustre un contrôle de flux avec une structure conditionnelle et une boucle `for` :
     - `Control flow: MyClass controlFlowExample x is positive`
     - `Loop MyClass controlFlowExample : i = 1`, `i = 2`, `i = 3`
     - Cette séquence se répète avec différentes valeurs de `x` :
       - Pour `x = 0` (zero) et `x = -1` (négatif), le message approprié est affiché.

### 6. **Création d'une instance de `CombinedExample`**
   - À la création de l'instance de `CombinedExample`, les blocs d'initialisation d'instance et le constructeur s'exécutent dans cet ordre :
     - `Instance block executed, CombinedExample`
     - `Instance variable initialized, CombinedExample`
     - `Constructor executed, CombinedExample`
   - La méthode d'instance est appelée :
     - `Method executed, myMethod CombinedExample`

### **Résumé de l'ordre d'exécution global :**
1. **Blocs statiques** dans l'ordre où les classes sont chargées (`CombinedExample`, `Super`, `Sub`, `MyClass`).
2. **Blocs d'initialisation d'instance** lors de la création d'objets, suivis par l'appel des **constructeurs**.
3. Les méthodes **statiques** et **d'instance** s'exécutent ensuite selon l'appel dans le code.

Cet exemple montre bien comment Java gère les blocs statiques, les blocs d'initialisation d'instance, et l'héritage dans l'exécution des classes.