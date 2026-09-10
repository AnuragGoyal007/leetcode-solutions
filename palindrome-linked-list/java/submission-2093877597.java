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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;

        ListNode mid = getMiddle(head);
        ListNode revMid = reverse(null,mid,null);
        while(revMid!=null){
            if(head.val != revMid.val)
                return false;

            revMid = revMid.next;
            head = head.next;
        }

        return true;

    }

    public static ListNode getMiddle(ListNode head){
        if(head==null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null && slow!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
    }

    public static ListNode reverse(ListNode prev, ListNode curr, ListNode next){
        if(curr==null) return prev;
        next = curr.next;
        curr.next = prev;
        return reverse(curr,next,null);
    }
}