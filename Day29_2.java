import java.util.*;

public class Day29_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = a[i] * a[i];
        Arrays.sort(b);
        for (int x : b) System.out.print(x + " ");
    }
}