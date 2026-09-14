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

    static int gcd(int a, int b){
        int gcd = 1;
        int min = Math.min(a, b);

        for(int i=min; i>=1; i--){
            if(a % i == 0 && b % i ==0){
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while(temp != null && temp.next != null){
            int a = temp.val;
            int b = temp.next.val;

            int g = gcd(a, b);

            ListNode newNode = new ListNode(g);

            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }
        return head;
    }
}