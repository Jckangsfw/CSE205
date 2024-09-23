public class M2LCA_Arrays {

    // Sums all odd numbers in the array
    public static int sumOfOdds(int[] array) {
        int sum = 0; // Initialize sum

        for (int value : array)
            if (value % 2 != 0) // Check if odd
                sum += value; // Add to sum if odd

        return sum; // Return total sum
    }

    // Returns an array with the min and max values
    public static int[] getMinAndMax(int[] array) {
        int[] minAndMax = { array[0], array[0] }; // Initialize with first element

        for (int value : array)
            if (value < minAndMax[0]) // Update min
                minAndMax[0] = value;
            else if (value > minAndMax[1]) // Update max
                minAndMax[1] = value;

        return minAndMax; // Return min and max
    }

    // Returns the range (max - min)
    public static int range(int[] array) {
        return getMinAndMax(array)[1] - getMinAndMax(array)[0]; // Calculate range
    }

    // Returns the second largest number in the array
    public static int getSecondLargest(int[] array) {
        int secondLargest = array[0]; // Initialize second largest
        int largest = array[0]; // Initialize largest

        for (int value : array)
            if (value > largest) { // Update largest and second largest
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest) // Update second largest
                secondLargest = value;

        return secondLargest; // Return second largest
    }

    // Returns an array of differences between consecutive elements
    public static int[] getDifferences(int[] array) {
        int[] output = new int[array.length - 1]; // Initialize output array

        for (int i = 0; i < array.length - 1; i++)
            output[i] = array[i + 1] - array[i]; // Calculate difference

        return output; // Return differences array
    }
}