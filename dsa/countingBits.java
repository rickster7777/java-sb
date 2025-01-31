import java.util.ArrayList;

public class countingBits {
  public static void main(String[] args) {
    int n = 2;
    ArrayList<String> arr = new ArrayList<>(); // Use ArrayList for dynamic storage
    arr.add("0");

    System.out.println("3 & 5 is: " + (3 & 5));
    System.out.println("3 | 5 is: " + (3 | 5));

    for (int i = 0; i <= n; i++) {

      if (i != 0) {
        String result = printBinary(i); // Get the binary string
        arr.add(result);
        System.out.println(result); // Print the binary representation
      }
    }

    System.out.println(arr);
  }

  // Correct return type is String
  public static String printBinary(int num) {
    StringBuilder binaryString = new StringBuilder(); // To build binary representation

    if (num == 0) {
      return "0";
    }

    while (num > 0) {
      binaryString.append(num % 2); // Append remainder (0 or 1) to the string
      num = num / 2; // Divide by 2
    }

    // Reverse the string since bits are appended in reverse order
    return binaryString.reverse().toString();
  }
}
