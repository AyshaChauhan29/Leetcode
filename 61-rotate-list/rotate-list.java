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

        if(head == null || head.next == null) return head;    //if list is null/empty

        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }

        int n = li.size();

        k = k % n;    // to perform only the leftover rotations

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        // add last k elements
        for (int i = n - k; i < n; i++) {
            res.next = new ListNode(li.get(i));
            res = res.next;
        }

        // Then add remaining elements
        for (int i = 0; i < n - k; i++) {
            res.next = new ListNode(li.get(i));
            res = res.next;
        }
        return dummy.next;
    }
}