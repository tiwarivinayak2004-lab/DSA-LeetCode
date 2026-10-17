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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int cnt=0;
        ListNode temp=head;
        while(temp.next!=null){
            cnt++;
            temp=temp.next;
        }
        cnt=cnt+1;
        k=k%cnt;
        if(k==0) return head;
        ListNode curr=head;
        for(int i=1;i<cnt-k;i++){
            curr=curr.next;
        }
        ListNode head2=curr.next;
        temp.next=head;
        curr.next=null;
        return head2;
    }
}