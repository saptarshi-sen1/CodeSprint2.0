import java.util.*;

class Node {
    int val;
    Node prev, next;
    Node(int val) { this.val = val; }
}

public class Day15_2 {
    static Node remove(Node head, int target) {
        for (Node curr = head; curr != null; ) {
            Node next = curr.next;
            if (curr.val == target) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
            }
            curr = next;
        }
        return head;
    }

    static Node build(String[] vals) {
        Node head = null, tail = null;
        for (String str : vals) {
            int v = Integer.parseInt(str);
            Node n = new Node(v);
            if (head == null) head = tail = n;
            else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }
        return head;
    }

    static void print(Node head) {
        for (Node c = head; c != null; c = c.next)
            System.out.print(c.val + (c.next != null ? " <-> " : ""));
        if (head == null) System.out.print("(empty list)");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] vals = s.nextLine().split(" ");
        int target = s.nextInt();
        Node head = build(vals);
        head = remove(head, target);
        print(head);
    }
}
