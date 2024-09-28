import java.util.ArrayList;

public class M2IA_GetInRange {

    // Returns elements within the given range [min, max].
    public static ArrayList<Integer> getInRange(ArrayList<Integer> myList, int min, int max) {
        ArrayList<Integer> output = new ArrayList<>();

        // Loop through the list and add elements within the range.
        for (int i = 0; i < myList.size(); i++)
            if (myList.get(i) >= min && myList.get(i) <= max)
                output.add(myList.get(i));

        return output;
    }
}