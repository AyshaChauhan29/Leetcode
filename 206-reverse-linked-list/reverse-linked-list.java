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

    public void createLL(int x){
        res.next = new ListNode(x);
        res = res.next;
    }

    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }

        int low = 0;
        int high = li.size()-1;

        while(low <= high){
            int tp = li.get(low);
            li.set(low, li.get(high));
            li.set(high, tp);

            low++;
            high--;
        }

        for(int i=0; i<li.size(); i++){
            createLL(li.get(i));
        }
        return dummy.next;
    }
}