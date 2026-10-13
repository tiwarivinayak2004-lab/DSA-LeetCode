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
        if(head==null || head.next==null){
            return null;
        }
        int cnt=0;
        ListNode temp=head;
        ListNode first=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(n==cnt){
            return head.next;
        }
        temp=head;
        for(int i=1;i<cnt-n;i++){
            first=first.next;
        }
        first.next=first.next.next;
        return head;
    }
}