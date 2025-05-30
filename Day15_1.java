import java.util.*;
class ListNode
{
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) {this.val = val; }
  ListNode(int val, ListNode next)
  {
    this.val = val;
    this.next = next;
  }
}

class Day15_1
{
  public ListNode addTwoNumbers(ListNode l1, ListNode l2)
  {
    ListNode dummy = new ListNode(0);
    ListNode cur = dummy;
    int carry = 0;

    while(l1!=null || l2!=null || carry != 0)
    {
      int val1=(l1!=null)? l1.val:0;
      int val2=(l2!=null)?l2.val:0;
      int sum = val1+val2+carry;
      carry = sum/10;
      cur.next = new ListNode(sum%10);
      cur = cur.next;
      if(l1!=null)
        l1=l1.next;
      if(l2!=null)
        l2=l2.next;
    }
    return dummy.next;
  }
  static ListNode build(int[] a)
  {
    ListNode d=new ListNode(0), c=d;
    for(int v:a)
      c=c.next = new ListNode(v);
    return d.next;
  }

  static void print(ListNode n)
  {
    System.out.print("[");
    while(n!=null)
    {
      System.out.print(n.val+(n.next!=null?", ":""));
      n = n.next;
    }
    System.out.println("]");
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    int m = sc.nextInt(), b[] = new int[m];
    for(int i=0;i<m;i++)
      b[i] = sc.nextInt();
    ListNode res = new Day15_1().addTwoNumbers(build(a), build(b));
    print(res);
  }
}