import java.util.*;

public class prime {
  public static void main(String[] args) {
    // int num = 7;

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    boolean result = primeCheck(num);

    String prime = result == true ? "Number is a prime number" : "number is not a prime num";

    System.out.println(prime);
  }

  public static boolean primeCheck(int num) {

    for (int i = 2; i < num / 2; i++) {

      if (num % i == 0) {
        return false;
        // break;
      }
    }
    return true;
    // System.out.println("number is prime");
  }
}