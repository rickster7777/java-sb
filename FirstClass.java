import java.util.*;

class FirstClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i <= 5; i++) {
            System.out.println("*".repeat(i + 1));
            // for (int j = 0; j < i; j++) {
            // System.out.println("*".repeat(i));
            // }

        }

        int num = 5;
        for (int i = 0; i <= num; i++) {
            System.out.println("*".repeat(num - i));
        }

        int sum = a + b;

        System.out.println(sum);

        System.out.println("Hello World!!!");
        System.out.println("Hello again !!!");
    }
}