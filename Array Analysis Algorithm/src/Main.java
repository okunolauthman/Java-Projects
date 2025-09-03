import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateIntArray(10);// method requires an integer arg
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr); will print the array's memory address, not its contents.
    }

//------- method for generating random Array
    public static int[] generateIntArray(int n) {
       int[] arr = new int[n]; // Creates an int array of size n
       Random r = new Random();// Creates a Random object to generate random numbers
      for (int i = 0; i < arr.length; i++) {
          arr[i] = r.nextInt(n);
          // nextInt(), returns a random integer. While r.nextInt(100),specify the upper limit
      }
        return arr;
    }

     // Print every element in an array
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // sum up all element in an array
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Check Array for any Duplicates
    public boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return true;

            }
        }
        return false;
      }
    }

