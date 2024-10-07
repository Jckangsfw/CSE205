/*
 * Object-Oriented Programming (OOP) Concepts in Java:
 * 
 * 0. Terminologies:
 * - Properties = Data = Fields = Instance Variables (Attributes).
 * - Behaviors = Methods (Instance Methods).
 * - Members = Properties + Behaviors.
 * 
 * 1. Class:
 * - A blueprint for creating objects.
 * - Defines data (fields) and behaviors (methods).
 * - Example: public class Introduction_OOP {class body}
 * 
 * 2. Object:
 * - An instance of a class holding specific values.
 * - Objects interact with one another through methods.
 * - Example: Introduction_OOP obj = new Introduction_OOP();
 * 
 * 3. Encapsulation:
 * - Bundles data and methods, restricting direct access with access modifiers.
 * - Data is accessed and modified through getter/setter (accessor/mutator) methods (private data with public access methods).
 * 
 * 4. Modifiers (member access):
 * - Control accessibility to classes, methods, and variables.
 * - 'public': Accessible from anywhere.
 * - 'private': Accessible only within the declared class.
 * - 'protected': Accessible within the same package or by subclasses.
 * - 'default': Accessible only within the same package (no modifier needed).
 * - 'static': Belongs to the class rather than any instance.
 * - 'final': Prevents inheritance for classes, reassignment for variables, and overriding for methods.
 * 
 * 5. Inheritance:
 * - A subclass/derived class/child class inherits fields and methods from a superclass/base class/parent class.
 * - Establishes an "is-a" relationship conceptually (the subclass is a specific type of the superclass).
 * - Also establishes a "parent-child" relationship structurally (the superclass is the parent, and the subclass is the child).
 * - Constructors from the superclass are not inherited by their subclasses.
 * - However, subclasses can use the 'super()' keyword to call a superclass constructor, but not to inherit it.
 * - Example: public class Dog extends Animal
 * 
 * 6. Polymorphism:
 * - A concept that allows one object to take many forms through overloading or overriding.
 * - Overloading (Compile-time polymorphism) (also known as static polymorphism) (same method name, different parameters).
 * - Overriding (Run-time polymorphism) (also known as dynamic polymorphism)(same method name and parameters).
 * - Example: dog.makeSound(); // Calls Dog's overridden method.
 * 
 * 7. Abstraction:
 * - Hides complexity, showing only essential member structures.
 * - Achieved with abstract classes or interfaces.
 * - An abstract class can contain both abstract methods (without implementation) and concrete methods (with implementation). 
 * - It cannot be instantiated directly as it’s meant to be subclassed.
 * - A concrete class is a fully implemented class that can be instantiated.
 * - A concrete class must must provide implementations for all abstract methods of its abstract superclass or interface.
 * - Example:
 *   - An abstract class `Animal` might define an abstract method `makeSound()` with no implementation.
 *   - A concrete subclass `Dog` provides the actual implementation of `makeSound()`, e.g., `Dog: barks`.
 *   - An interface `Vehicle` defines a contract for implementing methods like `start()` and `stop()` without defining their behavior.
 * 
 * 8. Constructor:
 * - A special method used to initialize objects.
 * - It has the same name as the class and no return type.
 * - Example: public Introduction_OOP() {constructor body}
 * 
 * 9. This Keyword:
 * - Refers to the current instance of a class.
 * - Distinguishes fields from method parameters.
 * - Example: this.name = name;
 * 
 * 10. Super Keyword:
 * - Accesses superclass members, including constructors.
 * - Example: super(); // Calls the superclass constructor.
 */

/*
 * 0. Variables in Java fall into three categories (global variable is not supported by Java):
 * - Instance variables.
 * - Static variables (Class variables).
 * - Local variables.
 * 
 * 1. Instance Variables:
 * - Definition: Variables that belong to an instance of a class. Each object has its own copy.
 * - Scope: Accessible within instance methods and constructors.
 * - Lifetime: Exist as long as the object exists.
 * 
 * 2. Static Variables (Class Variables):
 * - Definition: Variables that belong to the class, shared among all instances.
 * - Scope: Accessible in static and instance methods.
 * - Lifetime: Exist for the lifetime of the class.
 * - Declaration: Declared with the static keyword.
 * 
 * 3. Local Variables:
 * - Definition: Variables declared inside methods, constructors, or blocks of code.
 * - Scope: Exist only within the method/block where they are declared.
 * - Lifetime: Created when the method/block is invoked and destroyed when the method/block exits.
 */

class TypesOfVariables {
    // Instance variable: Unique to each object of the class
    int instanceVar = 10;

    // Static variable (class variable): Shared among all objects of the class
    static int classVar = 20;

    public void instanceMethod(int localVar1) {
        // Local variable: Exists only within this method
        int localVar2 = 30;

        // Accessing instance variable
        System.out.println("Instance variable: " + instanceVar); // Output: 10

        // Accessing static variable
        System.out.println("Class variable: " + classVar); // Output: 20

        // Accessing local variable 1
        System.out.println("Local variable: " + localVar1); // Output: Depends on the argument passed

        // Accessing local variable 2
        System.out.println("Local variable: " + localVar2); // Output: 30
    }
}

/*
 * Methods in Java fall into three categories:
 * - Instance methods.
 * - Static methods (Class methods).
 * - Abstract methods.
 */

/*
 * Instance Methods:
 * - Definition: Methods associated with an instance (object) of a class.
 * - Scope: Can access both instance variables and static variables.
 * - Access: Called using an instance (object) of the class.
 * - Declaration: Defined without the static keyword.
 */

class InstanceMethod {
    int instanceVar = 10; // Instance variable: Specific to the object
    static int staticVar = 20; // Static variable (Class variable): Shared among all instances

    // Instance method: Can access both instance and static variables
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        System.out.println("Instance variable: " + instanceVar); // Output: 10
        System.out.println("Class variable: " + staticVar); // Output: 20
    }
}

/*
 * Static Methods (Class Methods):
 * - Definition: Methods associated with the class, not any instance.
 * - Scope: Can only access static variables and call other static methods.
 * - Access: Typically called using the class name.
 * - Declaration: Defined using the static keyword.
 */

class StaticMethod {
    static int classVar = 20; // Static (class) variable: Shared among all objects

    // Static method: Can only access static variables directly
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Class variable: " + classVar); // Output: 20
    }
}

/*
 * Abstract Methods:
 * - Definition: Methods without a body (must be implemented by subclasses).
 * - Scope: They can only exist in an abstract class or an interface.
 * - Access: Implemented by concrete subclasses of the abstract class.
 * - Declaration: Declared with the abstract keyword.
 */

// Abstract class with an abstract method
abstract class Pet {
    abstract void makeSound(); // Abstract method (no implementation)
}

// Subclass implementing the abstract method
class Cat extends Pet {

    @Override
    void makeSound() {
        System.out.println("Meow"); // Output: Meow
    }
}