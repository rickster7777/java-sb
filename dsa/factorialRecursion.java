public class factorialRecursion {
  static int factorial = 1;

  public static void main(String[] args) {
    // int factorial = 1;
    int num = 5;
    System.out.println(factorial(num));

  }

  public static int factorial(int num) {
    if (num == 1)
      return 1;
    return num * factorial(num - 1);
  }
}
