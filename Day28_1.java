import java.util.*;

public class Day28_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < 26; i++)
            if (count[i] > 0) pq.add(new int[]{count[i], i});

        StringBuilder res = new StringBuilder();
        int[] prev = {0, -1};

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            res.append((char) (now[1] + 'a'));
            now[0]--;

            if (prev[0] > 0) pq.add(prev);
            prev = now;
        }

        System.out.println(res.length() == s.length() ? res.toString() : "");
    }
}