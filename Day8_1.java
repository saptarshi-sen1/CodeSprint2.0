import java.util.*;

public class Day8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = sc.nextInt();
        int min = n + 1, sum = 0, l = 0;
        for (int r = 0; r < n; r++) {
            sum += a[r];
            while (sum >= target) {
                min = Math.min(min, r - l + 1);
                sum -= a[l++];
            }
        }
        System.out.println(min > n ? 0 : min);
        sc.close();
    }
}
