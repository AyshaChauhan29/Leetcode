/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // static int check(TreeNode p){
    //   if(p == null) return 0;
      
    //   int left = root
    // }

    // static int check2(TreeNode q){
    //   if(q == null) return 0;
    // }

    public boolean isSameTree(TreeNode p, TreeNode q) {
         
         //Base case

         if(p == null && q == null) return true;
         if(p == null || q == null) return false;
         if(p.val != q.val) return false;

         boolean left = isSameTree(p.left, q.left);
         boolean right = isSameTree(p.right, q.right);

         return left && right;   
    }
}