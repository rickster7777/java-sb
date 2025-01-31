public class reverseInteger {

  int MAX_SIZE = 76;

  public static void main(String[] args) {
    int num = 19;
    int result = 0;

    while (num != 0) {

      int lastDigit = num % 10;
      result = result * 10 + lastDigit;
      num = num / 10;
      // System.out.println(num);
    }
    System.out.println(result);
  }
}