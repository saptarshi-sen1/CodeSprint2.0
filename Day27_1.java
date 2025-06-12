import java.util.*;

public class Day27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        Map<Integer, Integer> scoreIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            scoreIndex.put(score[i], i);
        }

        Arrays.sort(score);
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int place = n - i;
            int idx = scoreIndex.get(score[i]);
            if (place == 1) result[idx] = "Gold Medal";
            else if (place == 2) result[idx] = "Silver Medal";
            else if (place == 3) result[idx] = "Bronze Medal";
            else result[idx] = String.valueOf(place);
        }

        System.out.println(Arrays.toString(result));
    }
}