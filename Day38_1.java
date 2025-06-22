import java.util.Scanner;

public class Day38_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        StringBuilder s = new StringBuilder("a");
        while (s.length() < k) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                char nextChar = (char) ((c == 'z') ? 'a' : c + 1);
                next.append(nextChar);
            }
            s.append(next);
        }
        char result = Character.toUpperCase(s.charAt(k - 1));
        System.out.println(result);
    }
}