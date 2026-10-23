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

    ListNode dummy = new ListNode(0);
    ListNode res = dummy;

    public void createLL(int x){
        res.next = new ListNode(x);
        res = res.next;
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int n = size(head);

        int[] arr = new int[n];
        int i= 0;

        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        //swap
        int tp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = tp;

        for(int j=0; j<n; j++){
            createLL(arr[j]);
        }
        return dummy.next;
    }
}