/*
 * An ArrayList in Java is a resizable array. It can automatically grow or shrink in size as elements are added or removed
 * Syntax: ArrayList<Type> arrayListName = new ArrayList<>(initialCapacity);
 * - "Type" is the type of elements stored in the ArrayList (e.g., Integer, String, etc.)
 * - "initialCapacity" is optional; it specifies the initial number of elements the ArrayList can hold before resizing
 * Example: ArrayList<Double> decimals = new ArrayList<>(10);
 * 
 * An ArrayList can only hold objects, not primitive types (e.g., boolean, byte, char, short, int, float, double, long)
 * Since Java 7, specifying the type parameter twice in the syntax ArrayList<Type> names = new ArrayList<Type>(); is redundant because specifying it once on the left side using the diamond operator, <>, is sufficient
 */

import java.util.ArrayList; // To use an ArrayList, you must import the ArrayList class

public class Introduction_ArrayList {
    public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple"); // List is now [Apple]
        list.add("Banana"); // List is now [Apple, Banana]
        list.add("Orange"); // List is now [Apple, Banana, Orange]

        // Accessing the element at index 1
        String fruit = list.get(1);
        System.out.println("Fruit at index 1: " + fruit); // Output: Banana

        // Modifies the element at index 1
        list.set(1, "Mango");
        System.out.println("Modified list: " + list); // Output: [Apple, Mango, Orange]

        // Check if the list contains a specific element
        boolean hasMango = list.contains("Mango");
        System.out.println("Contains Mango? " + hasMango); // Output: true

        // Remove an element from the ArrayList
        list.remove("Apple");
        System.out.println("List after removing Apple: " + list); // Output: [Mango, Orange]

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the list: " + size); // Output: 2

        System.out.println("Iterating through the list:");

        // Iterate through the items of the ArrayList using an enhanced for loop
        // An enhanced for loop is also known as a "for-each" loop
        for (String item : list)
            System.out.println(item); // Output: Mango, Orange

        // Clear all elements from the ArrayList
        list.clear();
        System.out.println("List after clear: " + list); // Output: []
    }
}