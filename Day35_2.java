import java.util.*;

public class Day35_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freq = new int[10001];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            freq[x]++;
        }

        int maxFreq = 0;
        for (int count : freq) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        System.out.println(maxFreq);
    }
}