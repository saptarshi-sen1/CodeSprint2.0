import java.util.*;
public class Day22_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), h[] = new int[n], l[] = new int[n], r[] = new int[n];
    for(int i = 0; i < n; i++) h[i] = sc.nextInt();
    l[0] = h[0]; r[n-1] = h[n-1];
    for(int i = 1; i < n; i++) l[i] = Math.max(l[i-1], h[i]);
    for(int i = n-2; i >= 0; i--) r[i] = Math.max(r[i+1], h[i]);
    int water = 0;
    for(int i = 0; i < n; i++) water += Math.min(l[i], r[i]) - h[i];
    System.out.println(water);
  }
}