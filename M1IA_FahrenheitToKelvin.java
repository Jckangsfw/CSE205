import java.util.Scanner; // Import the Scanner class from the java.util package for reading input

public class M1IA_FahrenheitToKelvin {

    // This method converts a temperature from Fahrenheit to Kelvin.
    // The formula used is: (Fahrenheit - 32) * 5/9 + 273.15
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5f / 9f + 273.15;
    }

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner kbd = new Scanner(System.in);

        // Prompt the user to enter a temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit : ");

        // Read the user input as a double (floating-point number)
        double fahrenheit = kbd.nextDouble();

        // Convert the F temperature to K using the fahrenheitToKelvin method
        double kelvin = fahrenheitToKelvin(fahrenheit);

        // Print the result to the console, formatted to 2 decimal places
        // "\n" adds a newline to flush the buffer
        // A buffer temporarily holds data in memory before it's flushed to the console
        // This ensures the cursor moves to the next line before the next output
        System.out.printf("%.2f degrees from Fahrenheit to Kelvin is %.2f\n", fahrenheit, kelvin);

        // Close the Scanner object to prevent resource leaks
        kbd.close();
    }
}