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


    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();

    // int n = count(head);
    // int[] arr = new int[n];
    // int k = 0;

    // ListNode tempr = head;

    // while(tempr != null){
    //     arr[k] = tempr.val;
    //     k++;
    //     tempr = tempr.next;
    // }


    // Linked List → ArrayList
    while(head != null){
        li.add(head.val);
        head = head.next;
    }


    for(int i=0; i<li.size()-1; i++){
        for(int j=i+1; j<li.size(); j++){
            if(li.get(i) > li.get(j)){
                int temp = li.get(i);
                li.set(i, li.get(j));
                li.set(j, temp);
            }
        }
    }


    ListNode dummy = new ListNode(0);
    ListNode res = dummy;

    for(int i=0; i<li.size(); i++){
        res.next = new ListNode(li.get(i));
        res = res.next;
    }
    return dummy.next;

    }
}