class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}

public class Day14_2 {
    static ListNode reverse(ListNode h) {
        ListNode p = null;
        while (h != null) {
            ListNode n = h.next;
            h.next = p;
            p = h;
            h = n;
        }
        return p;
    }

    static ListNode doubleList(ListNode head) {
        head = reverse(head);
        ListNode d = new ListNode(0), c = d;
        int carry = 0;
        while (head != null || carry > 0) {
            int sum = (head != null ? head.val : 0) * 2 + carry;
            c.next = new ListNode(sum % 10);
            carry = sum / 10;
            if (head != null) head = head.next;
            c = c.next;
        }
        return reverse(d.next);
    }

    public static void main(String[] args) {
        int[] input = {7, 6};//input 
        ListNode head = new ListNode(input[0]), curr = head;
        for (int i = 1; i < input.length; i++) curr = curr.next = new ListNode(input[i]);
        ListNode res = doubleList(head);
        while (res != null) {
            System.out.print(res.val + (res.next != null ? " -> " : ""));
            res = res.next;
        }
    }
}
