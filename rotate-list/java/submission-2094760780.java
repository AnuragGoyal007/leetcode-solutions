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
    // BRUTE - FORCE APPROACH
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }

        for(int i=1;i<=k;i++){
            ListNode temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            ListNode last = temp.next;
            temp.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }
}