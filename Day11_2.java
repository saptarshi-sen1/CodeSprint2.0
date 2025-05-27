import java.util.*;

public class Day11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 0, j = n - 1;
        int[] a = new int[n];
        for (int k = 0; k < n; k++) 
            a[k] = sc.nextInt();
        while (i <= j) {
            if (i == j) System.out.print(a[i++] + " ");
            else System.out.print(a[i++] + " " + a[j--] + " ");
        }
        sc.close();
    }
}
