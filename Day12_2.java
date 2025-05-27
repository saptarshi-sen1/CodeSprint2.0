import java.util.*;

class Node {
    int val; Node next;
    Node(int v) { val = v; }
}

public class Day12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c;
        if (n == 0) return;

        Node h = new Node(sc.nextInt()), t = h;
        for (int i = 1; i < n; i++) t = t.next = new Node(sc.nextInt());

        int[] count = new int[3];
        for (Node p = h; p != null; p = p.next) count[p.val]++;
        
        Node p = h;
        for (int i = 0; i < 3; i++)
            while (count[i]-- > 0) { p.val = i; p = p.next; }

        for (p = h; p != null; p = p.next)
            System.out.print(p.val + (p.next != null ? " -> " : ""));
    }
}
