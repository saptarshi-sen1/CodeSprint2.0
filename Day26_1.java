import java.util.*;

public class Day26_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();

        Arrays.sort(a);
        int best = Integer.MIN_VALUE, minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = a[i] + a[l] + a[r];
                int diff = Math.abs(sum - target);

                if (diff < minDiff || (diff == minDiff && sum > best)) {
                    best = sum;
                    minDiff = diff;
                }

                if (sum < target) l++;
                else r--;
            }
        }

        System.out.println(best);
    }
}