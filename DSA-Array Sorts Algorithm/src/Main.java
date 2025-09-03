//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2,9,10,89,79};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        selectionSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }

    //---selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop:
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first index is the smallest

            // Inner loop: checks the next element and compares then swap
            for (int j = i + 1; j < n; j++) { // J is the second index

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update to the new minimum's index
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}


