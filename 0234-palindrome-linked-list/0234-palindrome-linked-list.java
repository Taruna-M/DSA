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
        if (head == null || head.next == null) return true; 

        ListNode first = head, second = head;
        while (first!=null && first.next!=null) {
            second = second.next;
            first = first.next.next;
        }

        ListNode prev = null, curr = second;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = prev; 
        boolean ans = true;
        while (secondHalf!=null) {
        if (firstHalf.val != secondHalf.val) {
            ans = false;
            break;
        }
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
        }
        return ans;
    }
}