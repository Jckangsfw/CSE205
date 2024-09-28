public class M2IA_Range {

    // This method calculates the range (difference between largest and smallest
    // values) of the given array.
    public static int range(int[] myArray) {
        int largest = myArray[0]; // Initialize largest with the first element.
        int smallest = myArray[0]; // Initialize smallest with the first element.

        // Loop through the array to find the largest and smallest values.
        for (int value : myArray)
            if (value > largest)
                largest = value; // Update largest if current value is greater.
            else if (value < smallest)
                smallest = value; // Update smallest if current value is smaller.

        // Return the difference between the largest and smallest values (range).
        return largest - smallest;
    }
}