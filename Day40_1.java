import java.util.Scanner;

public class Day40_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double result = power(x, n);
        System.out.printf("%.5f\n", result);
    }

    public static double power(double x, int n) {
        if (n == 0)
            return 1;
        double half = power(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else if (n > 0)
            return x * half * half;
        else
            return (half * half) / x;
    }
}