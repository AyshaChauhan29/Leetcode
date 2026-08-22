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

        if(head == null || head.next == null) return head;

        ArrayList<Integer> li = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }

        int n = li.size();

        int[] arr = new int[n];
        int j = 0;

        k = k % n;    // to perform only the leftover rotations

        for(int i=n-k; i<n; i++){
            arr[j] = li.get(i);
            j++;
        }

        for(int i=0; i<n-k; i++){
            arr[j] = li.get(i);
            j++;
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        for(int i=0; i<arr.length; i++){
            res.next = new ListNode(arr[i]);
            res = res.next;
        }
        return dummy.next;
    }
}