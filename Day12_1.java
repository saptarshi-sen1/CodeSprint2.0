class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Day12_1 {
    static ListNode sortTemperatures(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null && curr.next != null) {
            if (curr.next.val < 0) {
                ListNode move = curr.next;
                curr.next = move.next;

                move.next = head;
                head = move;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(-2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(-5);

        head = sortTemperatures(head);
        print(head); // Output: -5 -3 -2 1 4
    }
}
