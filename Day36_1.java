import java.util.Scanner;
import java.text.DecimalFormat;

public class Day36_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days (n): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Number of days must be at least 1.");
            return;
        }

        double a = 1.0;
        double r = 1.0 / 3.0;
        double sum = a * (1 - Math.pow(r, n)) / (1 - r);

        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println("Total amount added after " + n + " days: " + df.format(sum));
    }
}