import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Day14_1 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};//example 2 input
        ListNode head = new ListNode(input[0]), curr = head;
        for (int i = 1; i < input.length; i++) curr = curr.next = new ListNode(input[i]);
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        List<Integer> res = new ArrayList<>();
        while (slow != null) {
            res.add(slow.val);
            slow = slow.next;
        }
        System.out.println(res);
    }
}
