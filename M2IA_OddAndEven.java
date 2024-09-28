public class M2IA_OddAndEven {

    // This method counts the number of odd and even elements in the given array.
    public static int[] evenAndOdd(int[] myArray) {
        int[] output = new int[2]; // Array to store the count of odd numbers at index 0 and even numbers at index 1.
        int even = 0; // Counter for even numbers.
        int odd = 0; // Counter for odd numbers.

        // Loop through the array to count even and odd numbers.
        for (int value : myArray)
            if (value % 2 == 0)
                even++; // Increment even counter if value is divisible by 2.
            else
                odd++; // Increment odd counter if value is not divisible by 2.

        // Store the counts of odd and even numbers in the output array.
        output[0] = odd; // Store the odd count.
        output[1] = even; // Store the even count.

        // Return the output array containing odd and even counts.
        return output;
    }
}
