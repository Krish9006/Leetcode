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
    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode curr=head,prev=null,next=null;
      if(head==null) return null;
      int x=k;
      while(curr!=null&&x>0){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        x--;
      }
      if(curr==null&&x>0){
        curr=prev;
        next=null;
        prev=null;
        while(curr!=null&&x>0){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
    }
      if(x>0){
        return prev;
        }else{
           head.next= reverseKGroup(curr,k);
            
        }
        return prev;

        
    }
}