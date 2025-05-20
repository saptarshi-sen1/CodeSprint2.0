import java.util.*;

public class Day2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if (scores[i] > scores[i - 1] && scores[i] > scores[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
