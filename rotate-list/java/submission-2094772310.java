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

// class Solution {
//     // BRUTE - FORCE APPROACH
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null || head.next==null || k==0){
//             return head;
//         }

//         for(int i=1;i<=k;i++){
//             ListNode temp = head;
//             while(temp.next.next!=null){
//                 temp = temp.next;
//             }
//             ListNode last = temp.next;
//             temp.next = null;
//             last.next = head;
//             head = last;
//         }
//         return head;
//     }
// }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }

        int length = 1;
        ListNode temp = head;
        while(temp.next!=null){
            length++;
            temp = temp.next;
        }

        k = k % length;

        if(k == 0){
            return head;
        }
        temp.next = head; // Make the list circular
        ListNode newTail = head;

        for(int i=0;i<length-k-1;i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null; // To remove infinite loop problem

        return newHead;


    }
}