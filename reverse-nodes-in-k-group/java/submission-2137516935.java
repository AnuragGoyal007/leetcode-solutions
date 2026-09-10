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
        if(head == null || k == 1)
            return head;

        ListNode temp = head;
        for(int i=0;i<k;i++){
            if(temp == null) return head;
            temp = temp.next;
        }

        ListNode newNode = revByK(null,head,null,k);
        head.next = reverseKGroup(temp, k);
        return newNode;
    }

    public static ListNode revByK(ListNode prev, ListNode curr, ListNode next, int k){
        if(k==0) return prev;
        next = curr.next;
        curr.next = prev;
        return revByK(curr, next, null, k-1);
    }
}