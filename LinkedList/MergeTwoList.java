import java.util.*;
class ListNode3 {
    int val;
    ListNode3 next;

    ListNode3(int val) {
        this.val = val;
        this.next = null;
    }
}
     class MergeTwoList.java {
         public static ListNode3 create(int arr[]) {
             ListNode3 dummy = new ListNode3(arr[0]);
             ListNode3 c = dummy;

             for (int i = 1; i < arr.length; i++) {
                 c.next = new ListNode3(arr[i]);
                 c = c.next;
             }
             return dummy;
         }
 public static ListNode3 insert(ListNode3 head)
 {
     ListNode3 temp=head;
     while(temp!=null)
     {

         temp=temp.next;
     }
     return head;
 }
         public static void printlist(ListNode3 head) {
             while (head != null) {
                 System.out.print(head.val + "->");
                 head = head.next;
             }
             System.out.print("null");
             System.out.println(" ");
         }
public static ListNode3 mergelist(ListNode3 l1,ListNode3 l2)
{
    ListNode3 dummy=new ListNode3(-1);
    ListNode3 temp=dummy;
    while(l1!=null && l2!=null)
    {
        if(l1.val<l2.val)
        {
            temp.next=l1;
            l1=l1.next;
        }
        else {
            temp.next=l2;
            l2=l2.next;
        }
        temp=temp.next;
    }
    if(l1!=null)
    {
        temp.next=l1;
    }
    else {
        temp.next=l2;
    }
    return dummy.next;
}


    }
}
