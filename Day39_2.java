import java.util.Scanner;

public class Day39_2 {

    public static int countGoodStrings(int index, int n) {
        if (index == n) return 1;

        int count = 0;
        if (index % 2 == 0) {
            for (int digit : new int[]{0, 2, 4, 6, 8}) {
                count += countGoodStrings(index + 1, n);
            }
        } else {
            for (int digit : new int[]{2, 3, 5, 7}) {
                count += countGoodStrings(index + 1, n);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countGoodStrings(0, n);
        System.out.println(result);
    }
}