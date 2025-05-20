import java.util.*;
public class Day1_1 {
    public static boolean canBuyIceCream(int budget, int[] iceCreamPrices) {
        for (int price : iceCreamPrices) {
            if (price == budget) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();
        System.out.print("Enter the number of ice cream prices: ");
        int n = sc.nextInt();
        int[] iceCreamPrices = new int[n];
        System.out.println("Enter the prices of the ice creams:");
        for (int i = 0; i < n; i++) {
            iceCreamPrices[i] = sc.nextInt();
        }
        boolean result = canBuyIceCream(budget, iceCreamPrices);
        System.out.println(result);
        sc.close();
    }
}
