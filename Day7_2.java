import java.util.*;

public class Day7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        System.out.println(maxProfit >= 2 ? maxProfit : 0);
    }
}
