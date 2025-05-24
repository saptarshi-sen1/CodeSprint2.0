import java.util.*;

public class Day7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String log = sc.nextLine();
        int count = 0;
        boolean inSegment = false;
        for (int i = 0; i < log.length(); i++) {
            char c = log.charAt(i);
            if (c == '1') {
                if (!inSegment) {
                    count++;
                    inSegment = true;
                }
            } else {
                inSegment = false;
            }
        }
        System.out.println(count);
    }
}
