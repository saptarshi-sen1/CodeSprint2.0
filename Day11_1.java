class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class Day11_1 {
    static boolean detectAndRemoveLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
            if (slow == fast) {
                Node p = head;
                if (p == slow) while (slow.next != p) slow = slow.next;
                else while (p.next != slow.next) { p = p.next; slow = slow.next; }
                slow.next = null;
                return true;
            }
        }
        return true;
    }

    static Node create(int[] v, int pos) {
        if (v.length == 0) return null;
        Node head = new Node(v[0]), cur = head, loop = null;
        for (int i = 1; i < v.length; i++) {
            cur.next = new Node(v[i]);
            cur = cur.next;
            if (i == pos - 1) loop = cur;
        }
        if (pos > 0) cur.next = loop;
        return head;
    }

    public static void main(String[] args) {
        System.out.println(detectAndRemoveLoop(create(new int[]{1,3,4}, 2)));
    }
}
