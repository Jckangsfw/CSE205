import java.util.ArrayList;

public class M2IA_AllLessThanAverage {

    // Returns elements less than the average.
    public static ArrayList<Integer> lessThanAverage(ArrayList<Integer> myList) {
        ArrayList<Integer> output = new ArrayList<>();
        int sum = 0;

        // Calculate the sum of all elements.
        for (int i = 0; i < myList.size(); i++)
            sum += myList.get(i);

        // Calculate the average.
        double average = (double) sum / myList.size();

        // Add elements less than the average to the output list.
        for (int i = 0; i < myList.size(); i++)
            if (myList.get(i) < average)
                output.add(myList.get(i));

        return output;
    }
}