import java.util.*;
public class Day28_2 {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t[] = new int[n], p = 0, i = 0, j, sc = 0, max = 0;
        for (; i < n; t[i++] = s.nextInt());
        p = s.nextInt(); Arrays.sort(t); i = 0; j = n - 1;
        while (i <= j)
            if (p >= t[i]) { p -= t[i++]; max = Math.max(max, ++sc); }
            else if (sc > 0) { p += t[j--]; sc--; }
            else break;
        System.out.print(max);
    }
}