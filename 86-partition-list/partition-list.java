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

    void createLL(int x){
        res.next = new ListNode(x);
        res = res.next;
    }

    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                createLL(temp.val);
            }
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            if(temp.val >= x){
                createLL(temp.val);
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}