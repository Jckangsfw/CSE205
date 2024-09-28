import java.util.ArrayList;

public class M2IA_AllDuplicates {
    public static ArrayList<Integer> getDuplicates(ArrayList<Integer> myList) {

        // Stores unique elements for comparison
        ArrayList<Integer> compareList = new ArrayList<>();

        // Stores the detected duplicate elements
        ArrayList<Integer> output = new ArrayList<>();

        // Iterate through the input list
        for (int i = 0; i < myList.size(); i++) {
            // If the element is not in compareList, add it
            if (!compareList.contains(myList.get(i)))
                compareList.add(myList.get(i));

            // If it's already in compareList but not yet in output, add it to output
            else if (!output.contains(myList.get(i)))
                output.add(myList.get(i));
        }

        // Return the list of duplicates
        return output;
    }
}