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


    static int nextGreater(int x, int i, int[] arr){
        for(int j=i+1; j<arr.length; j++){
           if(arr[j] > x) {
              return arr[j];
           }
        }
        return 0;
    }


    public int[] nextLargerNodes(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];

        ListNode temp = head;
        
        int idx=0;
        while(temp != null){
            arr[idx] = temp.val;
            idx++;
            temp = temp.next;
        }

        
       int[] ans = new int[n];
       
       for(int i=0; i<n; i++){
          int ele = nextGreater(arr[i], i, arr);
          ans[i] = ele;
       }
       return ans;
    }
}