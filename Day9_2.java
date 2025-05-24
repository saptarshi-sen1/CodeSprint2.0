import java.util.Scanner;

public class Day9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int n = text.length(), m = pattern.length();
        if (m > n) { System.out.println("[]"); return; }

        int base = 31, mod = 1_000_000_009;
        long pHash = 0, tHash = 0, power = 1;

        for (int i = 0; i < m; i++) {
            pHash = (pHash * base + pattern.charAt(i)) % mod;
            tHash = (tHash * base + text.charAt(i)) % mod;
            if (i < m - 1) power = (power * base) % mod;
        }

        boolean found = false;
        for (int i = 0; i <= n - m; i++) {
            if (pHash == tHash && text.substring(i, i + m).equals(pattern)) {
                System.out.print(i + " ");
                found = true;
            }
            if (i < n - m) {
                tHash = (tHash - text.charAt(i) * power % mod + mod) % mod;
                tHash = (tHash * base + text.charAt(i + m)) % mod;
            }
        }
        if (!found) System.out.println("[]");
    }
}
