import java.util.*;

public class Day21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of visitors: ");
        int n = sc.nextInt();
        int[] tickets = new int[n];
        System.out.print("Enter tickets array: ");
        for (int i = 0; i < n; i++) tickets[i] = sc.nextInt();
        System.out.print("Enter index k: ");
        int k = sc.nextInt();

        // Calculate time
        int time = 0;
        for (int i = 0; i < n; i++)
            time += Math.min(tickets[i], tickets[k] - (i > k ? 1 : 0));

        System.out.println("Output:\n" + time);
    }
}