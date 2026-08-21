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

    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                li.add(temp.val);
            }
            temp = temp.next;
        }

        temp = head;

        while(temp != null){
            if(temp.val >= x){
                li.add(temp.val);
            }
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

       for(int i=0; i<li.size(); i++){
         res.next = new ListNode(li.get(i));
         res = res.next;
       }

       return dummy.next;
        
    }
}