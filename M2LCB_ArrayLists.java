import java.util.ArrayList;
import java.util.Arrays;

public class M2LCB_ArrayLists {

    // Returns a list of integers that are less than the mean of the input list
    public static ArrayList<Integer> allLessThanMean(ArrayList<Integer> list) {
        int sum = 0;
        ArrayList<Integer> output = new ArrayList<>();
        for (int value : list)
            sum += value;

        // Calculate the average of the list
        double average = (double) sum / (double) list.size();

        // Add values less than the average to the output list
        for (int value : list)
            if (value < average)
                output.add(value);

        return output;
    }

    // Returns a list of absolute distances from the mean
    public static ArrayList<Double> distancesFromMean(ArrayList<Integer> list) {
        int sum = 0;
        ArrayList<Double> output = new ArrayList<>();
        for (int value : list)
            sum += value;

        // Calculate the average of the list
        double average = (double) sum / (double) list.size();

        // Calculate the absolute distance from the mean for each value
        for (int value : list)
            output.add(Math.abs(value - average));

        return output;
    }

    // Returns a list of common elements between two lists
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> output = new ArrayList<>();
        // Add elements that exist in both lists but are not yet in the output list
        for (int value : list1)
            if (list2.contains(value) && !output.contains(value))
                output.add(value);

        return output;
    }

    // Returns a list of elements in either list but not both
    public static ArrayList<Integer> symmetricDiff(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> output = new ArrayList<>();
        // Add elements in list1 that are not in list2 and not yet in the output
        for (int value : list1)
            if (!list2.contains(value) && !output.contains(value))
                output.add(value);

        // Add elements in list2 that are not in list1 and not yet in the output
        for (int value : list2)
            if (!list1.contains(value) && !output.contains(value))
                output.add(value);

        return output;
    }

    // Merges two sorted lists into one sorted list
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int index1 = 0, index2 = 0;

        // Merge elements from both lists in sorted order
        while (index1 < list1.size() && index2 < list2.size()) {
            if (list1.get(index1) < list2.get(index2)) {
                mergedList.add(list1.get(index1));
                index1++;
            } else {
                mergedList.add(list2.get(index2));
                index2++;
            }
        }

        // Add remaining elements from list1
        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        // Add remaining elements from list2
        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(0, 3, 9, 2));

        // Test symmetric difference between lists a and b
        System.out.println(symmetricDiff(a, b));
    }
}