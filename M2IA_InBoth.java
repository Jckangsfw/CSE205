import java.util.ArrayList;

public class M2IA_InBoth {

    public static ArrayList<Integer> inBoth(ArrayList<Integer> myList1, ArrayList<Integer> myList2) {
        // Stores the common elements between myList1 and myList2
        ArrayList<Integer> output = new ArrayList<>();

        // Iterate through each element in myList1
        for (Integer value : myList1)

            // If the element exists in both lists and is not in output, add it to output
            if (myList2.contains(value) && !output.contains(value))
                output.add(value);

        // Return the list of common elements
        return output;
    }
}