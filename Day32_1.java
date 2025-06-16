import java.util.Scanner;

public class Day32_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
            sum += nums[i];
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum - sum);
    }
}