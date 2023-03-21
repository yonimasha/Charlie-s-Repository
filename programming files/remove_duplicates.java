import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// bugs introduced: YM

public class remove_duplicates {

     /*
     * Requires: A list of integers and a list for removed elements to be added to
     * Modifies: The list of removed elements
     * Returns: A new list that contains no duplicates
     */
    public static List<Integer> removeDuplicates(List<Integer> arr, List<Integer> removedElements) {
        // Creates temporary array to ultimately be returned
        List<Integer> uniqueArr = new ArrayList<Integer>();
        // Iterates through given array, placing unique elements in uniqueArr and repeats in removedElements
        for (int i = 0; i <= arr.size(); i++) {
            if (uniqueArr.contains(arr.get(i))) {
                uniqueArr.add(arr.get(i));
            } else {
                removedElements.add(arr.get(i));
            }
        }
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Test the function
        List<Integer> arr = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> removedElements = new ArrayList<Integer>();
        List<Integer> uniqueArr = removeDuplicates(arr, removedElements);
        System.out.println("Original array: " + arr);
        System.out.println("Unique array: " + uniqueArr);
        System.out.println("Removed elements: " + removedElements);
    }
}
