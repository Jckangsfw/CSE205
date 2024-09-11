import java.util.ArrayList; // Import ArrayList to store words from the file
import java.io.File; // Import File class to handle file input
import java.io.FileNotFoundException; // Import exception for handling file-not-found errors
import java.util.Scanner; // Import Scanner for user input and file reading

public class M1LCB_WordPatternMatching {

    // Reads words from the given file and returns an ArrayList of words
    // Throws a FileNotFoundException if the specified file is not found
    public static ArrayList<String> getWordList(String fileName) throws FileNotFoundException {

        ArrayList<String> wordList = new ArrayList<>(); // Initialize a list to store words
        File file = new File(fileName); // Create a File object for the specified file
        Scanner scanner = new Scanner(file); // Initialize Scanner to read the file

        // Loop through the file and add each word to the list
        while (scanner.hasNext())
            wordList.add(scanner.next());

        scanner.close(); // Close the scanner to free resources
        return wordList; // Return the list of words
    }

    // Checks if a character at the specified index of the word matches the pattern
    public static boolean isMatchAtIndex(String word, String pattern, int index) {

        // Return false if index is out of bounds or negative
        if (index >= pattern.length() || index >= word.length() || index < 0)
            return false;

        // Checks if characters match or if the pattern has a wildcard '_'
        for (int i = 0; i < pattern.length(); i++)

            if (pattern.charAt(index) == '_' || pattern.charAt(index) == word.charAt(index))
                return true; // Return true if there's a match at the current index

        return false; // Return false if no match is found at the index
    }

    // Compares a word with the pattern to see if it matches the entire pattern
    public static boolean isMatch(String word, String pattern) {

        // Return false if word and pattern lengths are not the same
        if (word.length() != pattern.length())
            return false;

        // Loop through each character of the word and pattern
        for (int i = 0; i < word.length(); i++)

            // Return false if any character at the current index doesn't match the pattern
            if (!isMatchAtIndex(word, pattern, i))
                return false;

        return true; // Return true if all characters match the pattern
    }

    // Return a list of words from the wordList that match the given pattern
    public static ArrayList<String> getMatches(ArrayList<String> wordList, String pattern) {

        ArrayList<String> matches = new ArrayList<>(); // Initialize a list to store matching words

        // Loop through each word in the word list
        // An enhanced for loop ("for-each" loop)
        for (String word : wordList)

            // If the word matches the pattern, add it to the matches list
            if (isMatch(word, pattern))
                matches.add(word);

        return matches; // Return the list of matching words
    }

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in); // Initialize a Scanner for user input
        ArrayList<String> wordList, outputList = new ArrayList<>(); // Initialize lists to store words and matches
        String pattern; // Variable to store the user's input pattern

        // Prompt the user to enter a file name
        System.out.print("Enter a file name to search in : ");

        // Read the file name from user input
        String fileName = kbd.nextLine();

        try {
            // Try to read the word list from the specified file
            wordList = getWordList(fileName);

            System.out.println("File read successfully, initiating pattern matcher...");

            // Start a loop to get patterns from the user until they press Enter to exit
            while (true) {

                // Prompt the user to enter a pattern
                System.out.print("Enter a pattern to match (or press Enter to exit): ");
                pattern = kbd.nextLine(); // Read the pattern from user input

                // If the pattern is empty, exit the loop and terminate the program
                // is.Empty() matches "" but not any whitespace character, such as " "
                // is.Blank() matches "" and any number of whitespace characters, such as " "
                if (pattern.isEmpty()) {
                    System.out.println("Exiting...");
                    break;
                }

                // Get the list of words that match the pattern
                outputList = getMatches(wordList, pattern);

                // Print the list of matching words
                System.out.println(outputList);
            }
        }

        // Handle the case where the specified file is not found
        catch (FileNotFoundException exception) {
            System.out.println("Error: File not found, exiting...");
        }

        // Close the scanner to release resources
        kbd.close();
    }
}