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
        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int ele : li){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        for(int key : map.keySet()){
            if(map.get(key) == 1){
               res.next = new ListNode(key);
               res = res.next;
            }  
        }
  
        res.next = null;
        return dummy.next;
    }
}