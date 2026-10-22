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

    static int size(ListNode head){
        int count = 0;

        while(head != null){
           count++;
           head = head.next;
        }
        return count;
    }


    public boolean isPalindrome(ListNode head) {

       int n = size(head);
       int[] arr = new int[n];
       int i = 0;

       ListNode temp = head;

       while(temp != null){
         arr[i] = temp.val;
         i++;
         temp = temp.next;
       }

       int low = 0;
       int high = n-1;

       while(low <= high){
         if(arr[low] != arr[high]) return false;

         low++;
         high--;
       }
      
      return true;
    }
}