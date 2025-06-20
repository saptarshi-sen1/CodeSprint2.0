import java.util.Scanner;

public class Day36_2 {
    public static int nCr(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(nCr(n, r));
    }
}