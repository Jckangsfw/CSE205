public class M2IA_AverageAndSum {

    // This method calculates the average and sum of the elements in an array
    public static double[] averageAndSum(int[] myArray) {
        double[] output = new double[2]; // Array to store the average at index 0 and sum at index 1.

        double sum = 0.0; // Variable to hold the sum of the array elements.
        double average = 0.0; // Variable to hold the calculated average.
        int count = 0; // Variable to track the number of elements in the array.

        // Loop through the array and calculate the sum and count of elements.
        for (int value : myArray) {
            sum += value; // Accumulate the sum of array elements.
            count++; // Increment the count for each element.
        }

        // Calculate the average by dividing the sum by the total number of elements.
        average = (double) sum / count;

        // Store the average and sum in the output array.
        output[0] = average; // Store the average.
        output[1] = sum; // Store the sum.

        // Return the output array containing the average and sum.
        return output;
    }

    public static void main(String[] args) {
        // Main method is empty and can be used for testing or future functionality.
    }
}
