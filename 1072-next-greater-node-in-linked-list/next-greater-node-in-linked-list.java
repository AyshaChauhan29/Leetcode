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

    public int[] nextLargerNodes(ListNode head) {
        int n = count(head);
        int[] ans = new int[n];
        int i = 0;
        
        ListNode slow = head;
          
        while(slow != null){
            ListNode fast = slow.next;
            
            while(fast != null){
               if(fast.val > slow.val){
                  ans[i] = fast.val;
                  break;
               }
               fast = fast.next; 
            }
            slow = slow.next;
            i++;
        }
        return ans;
    }
}