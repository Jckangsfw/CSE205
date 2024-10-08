/*
 * Explicit Parameters vs Implicit Parameters in Java
 *
 * Explicit Parameters:
 * - These are arguments passed directly to a method when invoked.
 * - They appear explicitly in the method's definition.
 *
 * Implicit Parameters (similar to 'self' in Python):
 * - These refer to the object on which an instance method is invoked.
 * - The object is implicitly passed to the method, accessible via the `this` keyword.
 */

// Showing explicit passing of the object (Java doesn't support this)
class Explicit_Car {
    private String model; // Instance variable to hold car model

    public Explicit_Car(String model) { // Constructor with explicit parameter 'model'
        this.model = model; // Assigns the value of 'model' to the instance variable
    }

    // Hypothetical: Explicitly passing 'this' (the current object reference)
    public void displayModel(Explicit_Car thisCar) { // Explicit parameter 'thisCar' simulates 'this'
        System.out.println(thisCar.model); // Access the object's field via the explicitly passed object
    }

    public static void main(String[] args) {
        Explicit_Car myCar = new Explicit_Car("Tesla"); // Creating an object 'myCar'

        // Explicitly passing the object reference (hypothetical, not standard in Java)
        myCar.displayModel(myCar); // Passes 'myCar' explicitly to the method
    }
}

// Normal Java behavior: Implicit parameter usage (standard)
class ImplicitCar {
    private String model; // Instance variable to hold car model

    public ImplicitCar(String model) { // Constructor with explicit parameter 'model'
        this.model = model; // Assigns the value of 'model' to the instance variable
    }

    // Instance method with no explicit parameters; implicitly uses 'this'
    public void displayModel() {
        System.out.println(this.model); // 'this' is used implicitly to access the object's field
    }

    public static void main(String[] args) {
        ImplicitCar myCar = new ImplicitCar("Tesla"); // Create an object 'myCar'

        // Implicitly passes 'myCar' (the current object) to the method via 'this'
        myCar.displayModel(); // No need to explicitly pass the object
    }
}

/*
 * Liskov Substitution Principle (LSP):
 * - Subclasses can replace their superclass without changing expected behavior.
 * - Example: A Dog can substitute an Animal and still behave like an Animal.
 */

class Animal {
    // Generic sound behavior for an Animal.
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Specific sound behavior for a Dog.
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Introduction_OOP_Part2 {
    // Demonstrates LSP: Dog replaces Animal without changing behavior.
    public static void main(String[] args) {
        Animal animal = new Dog(); // Reference type is Animal, pointing to a Dog object
        animal.makeSound(); // Calls Dog's overridden method (outputs "Dog barks")
    }
}

/*
 * Why use "Animal animal = new Dog();" instead of "Dog animal = new Dog();"?
 * Polymorphism: Allows flexibility by assigning any Animal subtype.
 * - Animal animal = new Tortoise();
 * - animal = new Hare(); // Easily switch types
 * 
 * Code Generalization: Methods can handle any Animal subtype.
 * - public void startRace(Animal racer) {
 * - racer.run(); // Works with any Animal (Tortoise, Hare, etc.)
 * - }
 * 
 * Limitation:
 * - Only Animal methods and overridden methods in Dog can be used.
 * - New methods in the Dog class cannot be accessed via an Animal reference.
 */