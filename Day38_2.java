import java.util.Scanner;

public class Day38_2 {
    public static int getValue(int n, int k) {
        if (n == 1) return 0;
        int mid = 1 << (n - 2);
        if (k <= mid) {
            return getValue(n - 1, k);
        } else {
            return 1 - getValue(n - 1, k - mid);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(getValue(n, k));
    }
}