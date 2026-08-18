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

    public void createNewLL(int x){ //x = 1
        res.next = new ListNode(x);
        res = res.next;
    }

    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        //odd positions
        ListNode temp = head;

        while(temp != null){
            createNewLL(temp.val);
            if (temp.next == null) break;
            temp = temp.next.next;
        }

        temp = head.next;

        while(temp != null){
            createNewLL(temp.val);
            if (temp.next == null) break;
            temp = temp.next.next;
        }
        
        return dummy.next;
    }
}