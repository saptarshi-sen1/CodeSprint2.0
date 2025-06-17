import java.util.Scanner;

public class Day33_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        int count = 0;
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            } else if (c == '0') {
                if (ones > 0) {
                    count++;
                    ones--;
                }
            }
        }

        System.out.println(count);
    }
}