import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Day13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        int k = Integer.parseInt(sc.nextLine());

        ListNode dummy = new ListNode(0), p = dummy;
        for (String s : vals)
            p = p.next = new ListNode(Integer.parseInt(s));

        int len = vals.length, base = len / k, extra = len % k;
        ListNode curr = dummy.next;

        for (int i = 0; i < k; i++) {
            int size = base + (i < extra ? 1 : 0);
            System.out.print("[");
            for (int j = 0; j < size; j++) {
                System.out.print(curr.val + (j < size - 1 ? ", " : ""));
                curr = curr.next;
            }
            System.out.print("]");
            if (i < k - 1) System.out.print(" , ");
        }
    }
}
