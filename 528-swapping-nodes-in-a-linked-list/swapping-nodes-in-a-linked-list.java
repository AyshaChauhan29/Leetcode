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
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    ListNode dummy = new ListNode(0);
    ListNode res = dummy;
    
    void createLL(int x) {
        res.next = new ListNode(x);
        res = res.next;
    }

    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;

        int len = count(head);
        int[] arr = new int[len];
        int i=0;

        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }

        // Swap kth from beginning and kth from end
        int t = arr[k - 1];
        arr[k - 1] = arr[len - k];
        arr[len - k] = t;


        for(int j=0; j<len; j++){
            createLL(arr[j]);
        }
        return dummy.next;    
    }
}