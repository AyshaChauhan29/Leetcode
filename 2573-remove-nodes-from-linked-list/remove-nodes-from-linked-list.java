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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
    
        int max = -1;
        for(int i=li.size()-1; i>=0; i--){
            if(li.get(i) >= max){
               ans.add(li.get(i));
               max = li.get(i);
            }
        }
        Collections.reverse(ans);

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        for(int i=0; i<ans.size(); i++){
            res.next = new ListNode(ans.get(i));
            res = res.next;
        }
        return dummy.next;
    }
}