import java.util.*;

public class Day33_1.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int theme = sc.nextInt();
            freq.put(theme, freq.getOrDefault(theme, 0) + 1);
        }

        int uniqueThemes = freq.size();
        int occurOnce = 0;
        for (int count : freq.values()) {
            if (count == 1) occurOnce++;
        }

        if (uniqueThemes < K) {
            System.out.println("NO");
        } else if (occurOnce > 2 * K - uniqueThemes) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}