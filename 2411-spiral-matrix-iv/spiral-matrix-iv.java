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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();

        while (head != null) {
            li.add(head.val);
            head = head.next;
        }

        int[][] matrix = new int[m][n];

        // Initially fill with -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(matrix[i], -1);
        }

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        int k = 0;

        while (k < li.size() && top <= bottom && left <= right) {

            // Left -> Right
            for (int i = left; i <= right && k < li.size(); i++) {
                matrix[top][i] = li.get(k++);
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom && k < li.size(); i++) {
                matrix[i][right] = li.get(k++);
            }
            right--;

            // Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left && k < li.size(); i--) {
                    matrix[bottom][i] = li.get(k++);
                }
                bottom--;
            }

            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top && k < li.size(); i--) {
                    matrix[i][left] = li.get(k++);
                }
                left++;
            }
        }
        return matrix;
    }
}