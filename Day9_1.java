import java.util.Scanner;

public class Day9_1 {
    public static void findAnagrams(String logStream, String pattern) {
        int n = logStream.length(), m = pattern.length();
        if (n < m) return;

        int[] count = new int[26];
        for (char c : pattern.toCharArray()) count[c - 'a']++;

        int left = 0, right = 0, toMatch = m;

        while (right < n) {
            if (count[logStream.charAt(right++) - 'a']-- > 0) toMatch--;
            if (toMatch == 0) System.out.print(left + " ");
            if (right - left == m && ++count[logStream.charAt(left++) - 'a'] > 0) toMatch++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter log stream: ");
        String logStream = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        findAnagrams(logStream, pattern);
    }
}
