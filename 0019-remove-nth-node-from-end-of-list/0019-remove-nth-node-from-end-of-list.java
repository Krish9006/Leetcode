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
       ListNode temp=head;
       ListNode fast=head;
       for(int i=0;i<n;i++){
        fast=fast.next;
       }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            temp=temp.next;
            fast=fast.next;
        }
        temp.next=temp.next.next;
        return head;
       }
    }