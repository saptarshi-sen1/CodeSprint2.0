import java.util.*;

public class Day26_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);

        list.sort((a, b) -> {
            int f1 = freq.get(b), f2 = freq.get(a);
            return f1 != f2 ? f1 - f2 : a - b;
        });

        for (int num : list) System.out.print(num + " ");
    }
}