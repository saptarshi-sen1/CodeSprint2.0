import java.util.*;

class Node {
    int val;
    Node prev, next;
    Node(int v) { val = v; }
}

public class Day13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        Node head = new Node(a[0]), p = head;
        for (int i = 1; i < n; i++) {
            p.next = new Node(a[i]);
            p.next.prev = p;
            p = p.next;
        }

        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" <-> ");
        }
    }
}
