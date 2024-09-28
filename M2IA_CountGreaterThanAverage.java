public class M2IA_CountGreaterThanAverage {

    // Counts the number of elements greater than the average.
    public static int countGreaterThanAvg(int[] myArray) {
        int count = 0; // Counter for elements greater than the average.
        int sum = 0; // Sum of all array elements.

        // Loop through the array to calculate the total sum.
        for (int value : myArray)
            sum += value;

        // Calculate the average by dividing the sum by the number of elements.
        double average = sum / (double) myArray.length;

        // Loop through the array to count elements greater than the average.
        for (int value : myArray)
            if (value > average)
                count++; // Increment count if the value is greater than the average.

        // Return the total count of elements greater than the average.
        return count;
    }
}