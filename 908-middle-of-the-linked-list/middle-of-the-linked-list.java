/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        // int count=0;
        // ListNode t=head;
        // ListNode temp=head;
        // if(head.next==null)
        // return head;
        // while(t!=null)
        // {
        //     count+=1;
        //     t=t.next;
        // }
        
        // if(count%2==0)
        // count=(count/2);
        // else
        // count=count/2;
        // for(int i=1;i<count;i++)
        // {
        //     temp=temp.next;
        // }
        // head=temp.next;
        // return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode curr=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null){
            return slow;
        }
        else{
            return slow.next;
        }
    }
}