import java.util.Scanner; // Import the Scanner class from the java.util package for reading input

public class M1IA_NameToInitials {

    // Converts a full name into its initials.
    // Example: "John Doe" becomes "J. D."
    public static String toInitials(String name) {

        // Start by taking the first letter of the name and adding a period after it.
        String initials = name.substring(0, 1) + ".";

        // Find the first occurrence of a space in the name.
        int spaceIndex = name.indexOf(" ");

        // Loop to find each space in the name, indicating a new word.
        // For each space, add a space, the next word's first letter, and a period.
        while (spaceIndex != -1) {
            // Append the next word's initial.
            initials += " " + name.substring(spaceIndex + 1, spaceIndex + 2) + ".";

            // Update the spaceIndex to the position of the next space in the name.
            spaceIndex = name.indexOf(" ", spaceIndex + 1);
        }

        // Return the initials in uppercase format using String.format.
        return String.format("%S", initials);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner kbd = new Scanner(System.in);

        // Prompt the user to enter their full name.
        System.out.print("Enter name : ");

        // Read the full name input by the user.
        String name = kbd.nextLine();

        // Convert the full name to initials using the toInitials method.
        String initials = toInitials(name);

        // Print the full name and its corresponding initials.
        System.out.printf("For %s initials are : %s\n", name, initials);

        // Close the Scanner object to prevent resource leaks.
        kbd.close();
    }
}