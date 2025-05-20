import java.util.*;

public class Day4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        if (n > 10) {
            System.out.println("Abhik’s marathon journey intensifies! Let’s see his detailed zig-zag pattern:");
        }

        int maxLen = (n * 4) - 3;

        for (int day = 1; day <= n; day++) {
            String row = "";

            if (day % 2 == 1) {
                for (int i = 1; i <= day; i++) {
                    row += i;
                    if (i != day) row += "   ";
                }
            } else {
                for (int i = day; i >= 1; i--) {
                    row += i;
                    if (i != 1) row += "   ";
                }
            }

            int spaces = (maxLen - row.length()) / 2;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            System.out.println(row);
            total += day;
        }

        System.out.println("Total numbers printed: " + total);
    }
}
