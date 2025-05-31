import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Day16_1 {
    public ListNode Day16_1(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1), current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public static ListNode buildList(String[] arr) {
        ListNode dummy = new ListNode(0), current = dummy;
        for (String s : arr) {
            if (!s.isEmpty()) {
                current.next = new ListNode(Integer.parseInt(s));
                current = current.next;
            }
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        ListNode list1 = buildList(a), list2 = buildList(b);
        ListNode merged = new Day16_1().Day16_1(list1, list2);
        printList(merged);
    }
}
