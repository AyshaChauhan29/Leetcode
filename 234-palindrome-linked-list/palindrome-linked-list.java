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

        //find the mid of the LL
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow; 

        //reverse the linkedlist starting from mid till the end
        ListNode curr = mid;
        ListNode prev = null;

        while(curr != null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }

        curr = head;

        while(prev != null){
            if(prev.val != curr.val){
                return false;
            } 
            else{
                curr = curr.next;
                prev = prev.next;
            }
        }
        return true;
    }
}