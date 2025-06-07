import java.util.*;
public class Day23_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    Queue<Integer> r = new LinkedList<>(), d = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) 
      if (s.charAt(i) == 'R') r.add(i); else d.add(i);
    while (!r.isEmpty() && !d.isEmpty()) {
      int ri = r.poll(), di = d.poll();
      if (ri < di) r.add(ri + s.length());
      else d.add(di + s.length());
    }
    System.out.println(r.isEmpty() ? "Dire" : "Radiant");
  }
}