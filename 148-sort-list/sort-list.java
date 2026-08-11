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

    static int count(ListNode head){
        int ct = 0;
        while(head != null){
            ct++;
            head = head.next;
        }
        return ct;
    }


    public ListNode sortList(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];
        int j = 0;

        ListNode temp = head;

        while(temp != null){
            arr[j] = temp.val;
            j++;
            temp = temp.next;
        }

        Arrays.sort(arr);

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

       for(int i=0; i<n; i++){
         res.next = new ListNode(arr[i]);
         res = res.next;
       }
       return dummy.next;
    }
}