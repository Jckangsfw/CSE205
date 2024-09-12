import java.util.Scanner; // Import the Scanner class from the java.util package for reading input

public class M1IA_MakeBox {
    public static void main(String[] args) {

        int width, height; // Variables to store the width and height of the box
        char interior, border; // Variables to store the interior and border of the box
        Scanner kbd = new Scanner(System.in); // Scanner object for user input

        // Prompt user for the width of the box and store it
        System.out.print("Enter Width    : ");
        width = kbd.nextInt();

        // Prompt user for the height of the box and store it
        System.out.print("Enter Height   : ");
        height = kbd.nextInt();

        // Prompt user for the interior character and store it
        System.out.print("Enter Interior : ");
        interior = kbd.next().charAt(0);

        // Prompt user for the border character and store it
        System.out.print("Enter Border   : ");
        border = kbd.next().charAt(0);

        // Loop through each row of the box
        for (int i = 0; i < height; i++) {

            // Loop through each column of the box
            for (int j = 0; j < width; j++) {

                // Check if the current position is a border position
                if (j == 0 || j == width - 1 || i == 0 || i == height - 1)
                    System.out.print(border); // Print the border character

                else
                    System.out.print(interior); // Print the interior character
            }

            System.out.println(); // Move to the next line after printing each row
        }

        kbd.close(); // Close the scanner to avoid resource leaks
    }
}