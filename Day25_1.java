import java.util.*;

public class Day25_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n - 2 && !found; i++) {
            for (int j = i + 1; j < n - 1 && !found; j++) {
                for (int k = j + 1; k < n && !found; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        found = true;
                    }
                }
            }
        }
        System.out.println(found);
    }
}