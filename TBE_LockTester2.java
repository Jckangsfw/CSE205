/**
 * A simulated lock with digit buttons.
 */

class Lock2 {
    private String combination = "0042";
    private String input = "";

    /**
     * Simulates a digit button push.
     * 
     * @param button a digit 0 ... 9
     */
    public void push(int button) {
        // Integer.toString() converts an int to its String representation.
        // Integer.parseInt() converts a String representation of a number to an int.
        // Parsing means analyzing data to convert it into a usable form.
        input = input.concat(Integer.toString(button)); // Append the pressed button to input
    }

    /**
     * Simulates a push of the open button.
     * 
     * @return true if the lock opened
     */
    public boolean open() {
        boolean open = input.equals(combination); // Check if input matches the combination
        input = ""; // Reset input after each attempt
        return open; // Return true if lock opens, false otherwise
    }
}

public class TBE_LockTester2 {
    public static void main(String[] args) {
        Lock2 myLock = new Lock2();

        myLock.push(4);
        myLock.push(2);
        System.out.println("Combination: 42");
        System.out.println("Expected: false");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(0);
        myLock.push(0);
        myLock.push(4);
        myLock.push(2);
        System.out.println("Combination: 0042");
        System.out.println("Expected: true");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(0);
        myLock.push(4);
        myLock.push(2);
        System.out.println("Combination: 042");
        System.out.println("Expected: false");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(0);
        myLock.push(0);
        myLock.push(0);
        myLock.push(4);
        myLock.push(2);
        System.out.println("Combination: 00042");
        System.out.println("Expected: false");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(0);
        myLock.push(0);
        myLock.push(4);
        myLock.push(2);
        System.out.println("Combination: 0042");
        System.out.println("Expected: true");
        System.out.println("Your output: " + myLock.open());
    }
}