import java.util.*;

public class Day21_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] parts = sc.nextLine().split(",");

    Queue<Integer> q = new LinkedList<>();

    for (String s : parts)
      q.add(Integer.parseInt(s.trim()));

    List<Integer> revealed = new ArrayList<>();

    while (!q.isEmpty()) {
      revealed.add(q.poll());
      if (!q.isEmpty())
        q.add(q.poll());
    }

    System.out.println(String.join(", ", revealed.stream().map(String::valueOf).toArray(String[]::new)));
  }
}