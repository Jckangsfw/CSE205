import java.util.Scanner; // Import the Scanner class from the java.util package for reading input

public class M1IA_MetersToFeetAndInches {

    // Converts a distance in meters to a string representing feet and inches
    public static String metersToFeetAndInches(double meters) {

        // Convert meters to total inches (1 meter = 39.37 inches)
        double totalInches = meters * 39.37;

        // Calculate the number of feet by integer division of total inches by 12
        int feet = (int) totalInches / 12;

        // Calculate the remaining inches after converting to feet
        double remainingInches = totalInches % 12;

        // Format and return the result as a string in the format "X' Y.YY""
        return String.format("%d' %.2f\"", feet, remainingInches);
    }

    public static void main(String[] args) {

        // Create a Scanner object to read input from the keyboard
        Scanner kbd = new Scanner(System.in);

        // Prompt the user to enter a distance in meters
        System.out.print("Enter distance in Meters : ");

        // Read the entered distance in meters
        double meters = kbd.nextDouble();

        // Convert the distance to feet and inches, and display the result
        System.out.printf("%.2f meters is : %s", meters, metersToFeetAndInches(meters));

        // Close the scanner to prevent resource leaks
        kbd.close();
    }
}