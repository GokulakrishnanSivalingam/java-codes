import java.util.*;

class ListNode2
{
    int val;
    ListNode2 next;
    ListNode2(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode2(int val,ListNode2 next)
    {
        this.val=val;
        this.next=null;
    }
}
public class L1{
 public static ListNode2 Create(int arr[])
{
    if (arr.length == 0) return null;
    ListNode2 head=new ListNode2(arr[0]);
    ListNode2 c=head;
    for(int i=1;i<arr.length;i++)
    {
        c.next=new ListNode2(arr[i]);
        c=c.next;
    }
    return  head;
}
public static void  print(ListNode2 head)
{
    while(head!=null)
    {
        System.out.print(head.val+"->");
        head=head.next;
    }
    System.out.println("null");
}

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter list size");
        int n= sc.nextInt();
        System.out.println("enter list :");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        ListNode2 list1=Create(a);
        print(list1);
    }
}
