import java.util.*;

public class Day31_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            String current = words.get(i);
            for (int j = 0; j < i; j++) {
                if (words.get(j).compareTo(current) < 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}