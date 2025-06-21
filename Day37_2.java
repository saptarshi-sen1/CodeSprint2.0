import java.util.Scanner;

public class Day37_2 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n < 1 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}