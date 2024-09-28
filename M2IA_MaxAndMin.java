public class M2IA_MaxAndMin {

    // This method finds the maximum and minimum values in the given array.
    public static int[] maxAndMin(int[] myArray) {
        int[] output = new int[2]; // Array to store the max at index 0 and min at index 1.

        int max = myArray[0]; // Initialize max with the first element.
        int min = myArray[0]; // Initialize min with the first element.

        // Loop through the array to find max and min values.
        for (int value : myArray)
            if (value > max)
                max = value; // Update max if current value is greater.
            else if (value < min)
                min = value; // Update min if current value is smaller.

        // Store the max and min values in the output array.
        output[0] = max; // Store the max value.
        output[1] = min; // Store the min value.

        // Return the output array containing max and min.
        return output;
    }
}