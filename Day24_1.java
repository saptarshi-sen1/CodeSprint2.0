import java.util.*;
public class Day24_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(), r = "";
    Queue<Character> q = new LinkedList<>();
    int[] f = new int[26];
    for (char c : s.toCharArray()) {
      f[c - 'a']++;
      q.add(c);
      while (!q.isEmpty() && f[q.peek() - 'a'] > 1) q.poll();
      r += q.isEmpty() ? '#' : q.peek();
    }
    System.out.println(r);
  }
}