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
    public int lengthofll(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;

        }
        return len;
    }
    public ListNode recursiverev(ListNode head, int k, int lengthofll){
        if(lengthofll<k){
            return head;

        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;
       for(int i=0;i<k;i++){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;


        }
        ListNode nexthead = recursiverev( curr, k,lengthofll-k);
        head.next= nexthead ;
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int lenOfLL = lengthofll(head);
        ListNode kReverseHead = recursiverev(head, k, lenOfLL);
        return kReverseHead;
    }
}