import java.util.*;

public class Day23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = nums[0];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(0);

        for (int i = 1; i < n; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k) dq.poll();
            dp[i] = nums[i] + dp[dq.peek()];
            while (!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]) dq.pollLast();
            dq.add(i);
        }

        System.out.println(dp[n - 1]);
    }
}