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
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        while(head != null){
            set.add(head.val);
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        
        for(int ele : set){
            res.next = new ListNode(ele);
            res = res.next;
        }
        return dummy.next;
    }
}