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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        for(int i=0;i<=n;i++){
            second=second.next;
        }
        while(second!=null){
            first=first.next;
            second=second.next;
        }
        first.next=first.next.next;
        return dummy.next;
    }
}


        // int count=0;
        // if(head.next==null)
        // {
        //     return null;
        // }
        // while(t1!=null)
        // {
        //     count+=1;
        //     t1=t1.next;
        // }
        // int res=(count-n)+1;
        // ListNode temp=head;
        // if(res==1)
        // {
        //     head=head.next;
        //     return head;
        // }
        // for(int i=1;i<res;i++)
        // {
        //     t2=temp;
        //     temp=temp.next;
        // }
        // t2.next=temp.next;
        // return head;