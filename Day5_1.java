import java.util.Scanner;

public class Day5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int target = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                target = freq[i];
                break;
            }
        }
        boolean balanced = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0 && freq[i] != target) {
                balanced = false;
                break;
            }
        }
        if (balanced) {
            System.out.println("Aashriya smiles: Emotional balance found.");
        } else {
            System.out.println("Aashriya wonders: These thoughts were scattered.");
        }
        sc.close();
    }
}
