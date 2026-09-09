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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        ListNode temp = head;
        while(temp != null){
           if(set.contains(temp.val)){
             temp = temp.next;
           }else{
            res.next = new ListNode(temp.val);
            res = res.next;
            temp = temp.next;
           }
        }
        return dummy.next;
    }
}