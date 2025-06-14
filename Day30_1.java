import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day30_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine().trim();
        int x = 0, y = 0, slips = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        for (char step : steps.toCharArray()) {
            if (step == 'L') x--;
            else if (step == 'R') x++;
            else if (step == 'U') y++;
            else if (step == 'D') y--;
            String pos = x + "," + y;
            if (visited.contains(pos)) slips++;
            else visited.add(pos);
        }
        System.out.println(slips);
    }
}