import java.util.Arrays;
import java.util.HashMap;

// public class twoSum {
// public static void main(String[] args) {

// int[] nums = new int[] { 2, 7, 11, 15 }; // Correct way to declare an array
// int target = 9;

// // Loop to find two numbers that sum to the target
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) { // Start j from i + 1
// if (nums[i] + nums[j] == target) {
// // Correct way to print the pair
// System.out.println("Pair found: " + i + ", " + j);
// int[] result = { i, j };

// System.out.println(Arrays.toString(result));
// }
// }
// }
// }
// }

// reducing the time complexity from 0 (n^2) to 0 (n log n).

class twoSum {
  public static void main(String[] args) {

    int[] nums = new int[] { 3, 1, 2, 7, 11, 15 }; // Correct way to declare an array
    int target = 9;
    // Create a hash map to store the value and its index
    HashMap<Integer, Integer> map = new HashMap<>();

    // Traverse through the array
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i]; // The number we need to find

      // Check if the complement is already in the hash map
      if (map.containsKey(complement)) {
        // If it is, return the indices

        System.out.println(Arrays.toString(new int[] { map.get(complement), i }));
        // System.out.println(new int[] { map.get(complement), i });
      }

      // Otherwise, store the current number and its index
      map.put(nums[i], i);
    }

    // If no solution is found, return an empty array
    System.out.println(new int[] {});
  }
}
