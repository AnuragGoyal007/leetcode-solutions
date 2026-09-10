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
        if(head==null || head.next==null || k==0){
            return head;
        }

        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        k = k % length; // optimizing k
        if(k==0) return head;

        temp.next = head; // Making the list circular

        // find new tail (length - k steps)
        int steps = length - k;
        ListNode newTail = head;
        for(int i=1;i<steps;i++){
            newTail = newTail.next;
        }

        // Setting newHead
        ListNode newHead = newTail.next;

        // Break the circlular property
        newTail.next = null;

        return newHead; // return newHead after the rotations are made

    }
}