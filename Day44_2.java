import java.util.*;

public class Day44_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] words = new String[n];
        int[] bitmasks = new int[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                mask |= 1 << (c - 'a');
            }
            bitmasks[i] = mask;
        }

        int maxProduct = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((bitmasks[i] & bitmasks[j]) == 0) {
                    int product = words[i].length() * words[j].length();
                    if (product > maxProduct) {
                        maxProduct = product;
                    }
                }
            }
        }

        System.out.println(maxProduct);
    }
}