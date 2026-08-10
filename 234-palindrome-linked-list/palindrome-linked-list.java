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

    public boolean isPalindrome(ListNode head) {
        int n = count(head);
        int[] arr = new int[n];

        ListNode temp = head;
        int i=0;

        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        int low = 0;
        int high = arr.length-1;

        while(low < high){
            if(arr[low] != arr[high]) return false;
            low++;
            high--;
        }
        return true;
    }
}