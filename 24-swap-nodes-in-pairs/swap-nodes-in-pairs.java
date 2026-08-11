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

    public ListNode swapPairs(ListNode head) {
        int n = count(head);
        ListNode[] arr = new ListNode[n];

        ListNode tempr = head;
        
        int i=0;
        while(tempr != null){
            arr[i] = tempr;
            i++;
            tempr = tempr.next;
        }

        for(int j=0; j<n-1; j+=2){
            ListNode temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

      for(int j=0; j<n; j++){
        res.next = arr[j];
        res = res.next;
      }
      res.next = null;
      
        return dummy.next;
    }
}