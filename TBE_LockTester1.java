/*
 * A simulated lock with digit buttons.
 */

class Lock1 {
    private int combination = 1729;
    private int input;

    /**
     * Simulates a digit button push.
     * 
     * @param button a digit 0 ... 9
     */
    public void push(int button) {
        input = Integer.parseInt(input + "" + button); // Append the digit.
    }

    /**
     * Simulates a push of the open button.
     * 
     * @return true if the lock opened
     */
    public boolean open() {
        boolean open = input == combination;
        input = 0; // Reset input.
        return open;
    }
}

public class TBE_LockTester1 {
    public static void main(String[] args) {
        Lock1 myLock = new Lock1();

        myLock.push(1);
        myLock.push(7);
        myLock.push(3);
        myLock.push(9);
        System.out.println("Combination: 1739");
        System.out.println("Expected: false");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(1);
        myLock.push(7);
        myLock.push(2);
        myLock.push(9);
        System.out.println("Combination: 1729");
        System.out.println("Expected: true");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(1);
        myLock.push(7);
        myLock.push(2);
        System.out.println("Combination: 172");
        System.out.println("Expected: false");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(9);
        System.out.println("Combination: 9");
        System.out.println("Expected: false");
        System.out.println("Your output: " + myLock.open());
        System.out.println();

        myLock.push(1);
        myLock.push(7);
        myLock.push(2);
        myLock.push(9);
        System.out.println("Combination: 1729");
        System.out.println("Expected: true");
        System.out.println("Your output: " + myLock.open());
    }
}