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

    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
           li.add(temp.val);
           temp = temp.next;
        }

        for(int i=0; i<li.size()-1; i++){
            for(int j=i+1; j<li.size(); j++){
                if(li.get(i) > li.get(j)){
                   int tp = li.get(i);
                   li.set(i, li.get(j));
                   li.set(j, tp);
                }
            }
        }

        for(int i=0; i<li.size(); i++){
            createLL(li.get(i));
        }
        return dummy.next;
    }
}