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

    public ListNode oddEvenList(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];
        int k = 0;

        ListNode temp = head;
        while(temp != null){
            arr[k] = temp.val;
            k++;
            temp = temp.next;
        }

        int[] ans = new int[n];
        int idx = 0;

        for(int i=0; i<n; i++){
            if(i % 2 == 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }

        for(int i=0; i<n; i++){
            if(i % 2 != 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }

        for(int i=0; i<n; i++){
            arr[i] = ans[i];
        }


        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

       for(int i=0; i<n; i++){
         res.next = new ListNode(arr[i]);
         res = res.next;
       }
       return dummy.next;
    }
}