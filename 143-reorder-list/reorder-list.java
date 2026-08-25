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

    public void reorderList(ListNode head) {
        ArrayList<ListNode> li = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            li.add(temp);
            temp = temp.next;
        }

        int low = 0;
        int high = li.size() - 1;

        while(low < high){
            ListNode first = li.get(low);
            ListNode last = li.get(high);

            ListNode nextFir = li.get(low + 1);

            first.next = last;
            last.next = nextFir;

            low++;
            high--;
        }
        li.get(low).next = null;
    }
}