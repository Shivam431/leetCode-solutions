/*
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 */

/*
 * Definition for singly-linked list.*/
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
  
 
public class L2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode curr=res;
        int carry=0;
        while(l1!=null || l2!=null){
            int x=(l1!=null)?l1.val :0;
            int y=(l2!=null)? l2.val :0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(l1!=null)
                l1=l1.next;
            
            if(l2!=null)
                l2=l2.next;
        }
        if(carry>0)
        {
            curr.next=new ListNode(carry);
        }
        return res.next;
    }
}