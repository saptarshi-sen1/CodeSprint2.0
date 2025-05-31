import java.util.*;
class ListNode
{
  String val;
  ListNode next;
  ListNode(String val)
  {
    this.val = val;
  }

}

public class Day16_2
{
  public static ListNode reverseBetween(ListNode head, int left, int right)
  {
    if(head == null || left == right)
      return head;
    ListNode dummy = new ListNode("");
    dummy.next = head;
    ListNode prev = dummy;

    for(int i=1;i<left;i++)
      prev = prev.next;
    ListNode curr = prev.next;
    for(int i=0;i<right - left ; i++)
    {
      ListNode next = curr.next;
      curr.next = next.next;
      next.next = prev.next;
      prev.next = next;
    }
    return dummy.next;
  }

  public static ListNode buildList(String[] arr)
  {
    ListNode dummy = new ListNode(""), curr=dummy;
    for(String s : arr)
    {
      curr.next = new ListNode(s);
      curr = curr.next;
    }
    return dummy.next;
  }

  public static List<String> toList(ListNode head)
  {
    List<String> result = new ArrayList<>();
    while(head != null)
    {
      result.add(head.val);
      head = head.next;
    }
    return result;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    int left = sc.nextInt();
    int right = sc.nextInt();
    ListNode head = buildList(arr);
    ListNode newHead = reverseBetween(head, left, right);
    List<String> output = toList(newHead);
    System.out.println(output);
  }
}