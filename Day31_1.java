import java.util.*;

public class Day31_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        Set<String> beautifulPairs = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && cards[i] > cards[j]) {
                    String pair = cards[i] + "," + cards[j];
                    beautifulPairs.add(pair);
                }
            }
        }

        System.out.println(beautifulPairs.size());
    }
}