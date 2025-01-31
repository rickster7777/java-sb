
// Sieve of Eratosthenes
import java.util.*;

public class countPrime {
  public static void main(String[] args) {
    // int num = 14;

    String numbers = "";
    int count = 0;
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for (int i = 2; i < num; i++) {
      boolean result = primeCheck(i);
      // System.out.println("result" + result);
      numbers = result == true ? numbers + "," + i : numbers;
      count = result == true ? count + 1 : count;
    }

    // String prime = result == true ? "Number is a prime number" : "number is not a
    // prime num";

    System.out.println("There are " + count + " prime numbers less than " + num + ":" + numbers);
  }

  public static boolean primeCheck(int num) {
    // System.out.println(num);
    for (int i = 2; i < num / 2; i++) {

      if (num % i == 0) {
        return false;
        // break;
      }
    }
    boolean conclusion = num == 4 ? false : true;
    return conclusion;
    // System.out.println("number is prime");
  }
}
