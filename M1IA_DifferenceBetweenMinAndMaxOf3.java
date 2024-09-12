public class M1IA_DifferenceBetweenMinAndMaxOf3 {

    // Calculates the difference between the smallest and largest of three integers.
    public static int minMaxDiff(int firstNumber, int secondNumber, int thirdNumber) {

        // Store the three integers in an array for easy iteration.
        int[] numbers = { firstNumber, secondNumber, thirdNumber };

        // Initialize smallest and largest with the first number.
        int smallestNumber = firstNumber;
        int largestNumber = firstNumber;

        // Iterate through the array to find the smallest and largest numbers.
        for (int number : numbers) {
            // Update smallestNumber if a smaller number is found.
            if (number < smallestNumber)
                smallestNumber = number;

            // Update largestNumber if a larger number is found.
            else if (number > largestNumber)
                largestNumber = number;
        }

        // Return the positive difference between the largest and smallest numbers.
        return largestNumber - smallestNumber;
    }
}