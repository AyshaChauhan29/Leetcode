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

    ListNode dummy = new ListNode(0);
    ListNode res = dummy;

    void createLL(int x) {
        res.next = new ListNode(x);
        res = res.next;
    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow;

        while(temp != null){
            if(temp != mid){
                createLL(temp.val);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}