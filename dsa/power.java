public class power {
  public static void main(String[] args) {
    System.out.println(calcpower(3, 3));
  }

  private static int calcpower(int i, int j) {
    // TODO Auto-generated method stub
    if (j == 1)
      return i;

    if (j == 0)
      return 1;

    int power = 1;

    for (int p = 0; p < j; p++) {
      power *= i;
    }
    return power;
    // throw new UnsupportedOperationException("Unimplemented method 'calcpower'");
  }
}
