import java.util.*;

public class Day35_1 {

    public static boolean isValid(int[] weights, int maxWeight, int k) {
        int currentSum = 0;
        int count = 1;

        for (int weight : weights) {
            if (weight > maxWeight) {
                return false;
            }
            if (currentSum + weight > maxWeight) {
                count++;
                currentSum = weight;
            } else {
                currentSum += weight;
            }
        }

        return count <= k;
    }

    public static int findMinMaxBoxWeight(int[] weights, int k) {
        int left = 0, right = 0;

        for (int weight : weights) {
            right += weight;
        }

        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isValid(weights, mid, k)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.println(findMinMaxBoxWeight(weights, k));
    }
}