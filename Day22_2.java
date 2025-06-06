import java.util.*;
public class Day22_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    for(int i = 0; i < n; i++) q.add(sc.nextInt());
    int[] s = new int[n];
    for(int i = 0; i < n; i++) s[i] = sc.nextInt();
    int i = 0, count = 0;
    while(!q.isEmpty() && count < q.size()) {
      if(q.peek() == s[i]) {
        q.poll(); i++; count = 0;
      } else {
        q.add(q.poll()); count++;
      }
    }
    System.out.println(q.size());
  }
}