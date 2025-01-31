// public class powerOfTwo {
//   public static void main(String[] args) {
//     int n = 7;

//     for (int i = 0; i < n / 2; i++) {
//       int power = (int) Math.pow(2, i);
//       boolean result = power == n ? true : false;

//       if (result == true) {
//         System.out.println(n + " Is a power of two");
//         break;
//       }
//     }

//     System.out.println(n + "Is not a power of two");

//   }
// }

/*
 * Above code has a time complexity of o(n).
 * below is the solution that provides
 */

/*
 * Explanation:
The condition (n & (n - 1)) == 0:
If n is a power of two, this expression evaluates to true.
If n is not a power of two, the result will not be zero, so the function will return false.
Time Complexity:
Time Complexity:
The time complexity is O(1) because the bitwise operations happen in constant time.

Space Complexity:
O(1), as only a few variables are used for the computation.

This solution is much more efficient than the previous one, as it checks the condition in constant time using bitwise operations.

 */

public class powerOfTwo {
  public static void main(String[] args) {
    int n = 16; // Example number to check

    if (isPowerOfTwo(n)) {
      System.out.println(n + " is a power of two");
    } else {
      System.out.println(n + " is not a power of two");
    }
  }

  public static boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false; // Negative numbers and zero are not powers of two
    }
    return (n & (n - 1)) == 0;
  }
}
