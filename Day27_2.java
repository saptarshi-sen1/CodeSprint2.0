import java.util.*;

public class Day27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] count = new int[n + 1];
        for (int num : nums) {
            count[num]++;
        }

        int duplicate = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        System.out.println("[" + duplicate + ", " + missing + "]");
    }
}