/*
 * An array is a collection of elements of the same type stored in contiguous memory.
 * Its elements are accessible via an integer index.
 * 
 * Syntax 1: Type[] arrayName = new Type[capacity];
 * Syntax 2: Type[] arrayName = {values};
 * - "Type" represents the data type of the elements (either primitive or reference types).
 * - "capacity" is the number of elements the array can hold.
 *
 * Examples:
 * 1) int[] integerArray = new int[10];
 * 2) int[] integerArray = {1, 2, 3, 4, 5, 6};
 *
 * Arrays are reference types:
 * - A "reference" is a memory address pointing to the object in heap memory.
 *
 * 
 * Stack Memory
 * ---------------------------------------------------------------------------------------
 * Location |                            Value                            | VariableName          
 * ---------------------------------------------------------------------------------------
 * 0x666    | 0x1A (a pointer (memory address) to the array on the heap)  | integerArray
 * 
 * Heap Memory
 * ---------------------
 * Location   | Object
 * ---------------------
 * 0x1A       | Array Metadata (length, type)
 * 0x1B       | 1
 * 0x1C       | 2
 * 0x1D       | 3
 * 0x1E       | 4
 * 0x1F       | 5
 * 0x20       | 6
 * 
 * The heap stores the array object, including A) metadata (like array's type and length) and B) the elements in contiguous memory.
 * The offset is calculated from the base address of the elements (0x1B), not the object (0x1A).
 * Offset: the distance from the base address to the element's location.
 * Formula: address_of_element_n = base_address + (n * element_data_type_size).
 * Example: If base_address = 0x100 and the element size is 4 bytes (for int), array[4] (5th element) is at 0x100 + (4 * 4) = 0x110.
 * 
 * 
 * Two-dimensional (2D) Array:
 * Syntax 1: Type[][] arrayName = new Type[numberOfRows][numberOfColumns];
 * Syntax 2: Type[][] arrayName = {{values}, {values}, {values}};
 */

import java.util.Arrays;
import java.util.ArrayList;

public class Introduction_Arrays {
    public static void main(String[] args) {
        basicArrayOperations(); // Example of basic array operations
        arraysUtilityClass(); // Example using Java's Arrays utility class
        multiDimensionalArray(); // Example of two-dimensional arrays
        jaggedArrayExample(); // Example of jagged arrays (arrays with different lengths)
        enhancedForLoopExample(); // Example of using enhanced for-loop with arrays
        reverseArrayExample(); // Example of reversing an array
        sumAndAverageExample(); // Example to calculate sum and average of array elements
        dynamicArrayExample(); // Example of dynamic array using ArrayList
    }

    // 1. Basic Operations on One-Dimensional Arrays
    public static void basicArrayOperations() {

        // Create an array of integers
        int[] array = { 10, 20, 30, 40, 50 };

        array[2] = 100; // Modify the 3rd element to 100

        // Print the modified element
        System.out.println("Modified element: " + array[2]); // Output: 100

        // Iterate through the array and print each element
        System.out.print("Array elements: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " "); // Output: 10 20 100 40 50

        System.out.println(); // Newline after the elements
    }

    // 2. Arrays Utility Class (fill, copy, sort)
    public static void arraysUtilityClass() {

        // Create an integer array of 5 capacities
        int[] array = new int[5];

        Arrays.fill(array, 7); // Fill the array with the value 7
        System.out.println("Filled array: " + Arrays.toString(array)); // Output: [7, 7, 7, 7, 7]

        // Copy part of an array
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] newArray = Arrays.copyOfRange(originalArray, 1, 4); // Copy from index 1 to 3
        System.out.println("Copied array: " + Arrays.toString(newArray)); // Output: [2, 3, 4]

        // Sort an unsorted array
        int[] unsortedArray = { 5, 1, 4, 3, 2 };

        Arrays.sort(unsortedArray); // Sort the array in ascending order
        System.out.println("Sorted array: " + Arrays.toString(unsortedArray)); // Output: [1, 2, 3, 4, 5]
    }

    // 3. Multidimensional Array (2D Array)
    public static void multiDimensionalArray() {

        // Create and initialize a 3x3 2D array (matrix)
        int[][] matrix = {
                { 1, 2, 3 }, // Row 0
                { 4, 5, 6 }, // Row 1
                { 7, 8, 9 } // Row 2
        };

        // Access and print a specific element from the 2D array
        System.out.println("Element at [1][2]: " + matrix[1][2]); // Output: 6

        // Print the entire 2D array
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        /*
         * Output:
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
    }

    // 4. Jagged Array Example
    public static void jaggedArrayExample() {

        // Declare a jagged array (arrays with different lengths)
        // Create an array that has 3 rows.
        // However, the number of columns for each row is not defined at this point.
        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[] { 1, 2 }; // Row 0 has 2 elements
        jaggedArray[1] = new int[] { 3, 4, 5 }; // Row 1 has 3 elements
        jaggedArray[2] = new int[] { 6, 7, 8, 9 }; // Row 2 has 4 elements

        // Print the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++)
                System.out.print(jaggedArray[i][j] + " ");
            System.out.println();
        }

        /*
         * Output:
         * 1 2
         * 3 4 5
         * 6 7 8 9
         */
    }

    // 5. Enhanced For Loop Example
    public static void enhancedForLoopExample() {

        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Use an enhanced for loop to iterate and print each element
        System.out.print("Array elements: ");
        for (int number : numbers)
            System.out.print(number + " "); // Output: 1 2 3 4 5

        System.out.println();
    }

    // 6. Reverse Array Example
    public static void reverseArrayExample() {

        // Create an array and reverse its elements
        int[] array = { 1, 2, 3, 4, 5 };

        reverseArray(array); // Reverse the array in place
        System.out.println("Reversed array: " + Arrays.toString(array)); // Output: [5, 4, 3, 2, 1]
    }

    // Helper method to reverse an array in place
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap elements from both ends moving toward the center
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move indices toward the center
            left++;
            right--;
        }
    }

    // 7. Sum and Average of Array Elements
    public static void sumAndAverageExample() {

        // Create an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Calculate the sum of elements in the array
        int sum = 0;

        for (int number : numbers)
            sum += number; // Add each element to the sum

        // Calculate the average value
        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum); // Output: 150
        System.out.println("Average: " + average); // Output: 30.0
    }

    // 8. Dynamic Array Example (using ArrayList)
    public static void dynamicArrayExample() {

        // Create a dynamic array (ArrayList)
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Add elements to the dynamic array
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);

        // Print all elements in the dynamic array
        System.out.println("Dynamic array elements: " + dynamicArray); // Output: [1, 2, 3, 4, 5]

        // Remove the element at index 2 (third element, which is '3')
        dynamicArray.remove(2);

        // Print the dynamic array after removing an element
        System.out.println("After removal: " + dynamicArray); // Output: [1, 2, 4, 5]
    }
}