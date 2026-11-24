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
   
    //homework ---> path Sum

    static boolean helper(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        boolean left = helper(p.left, q.right);
        boolean right = helper(p.right,  q.left);

        return left && right;
    }

    public boolean isSymmetric(TreeNode root) {
    //     if(root == null) return false;
        
    //     boolean left = isSymmetric(root.left);
    //     boolean right = isSymmetric(root.right);

    //    // if(root.left.val == root.right.val) return true;
    //    // return false;

    //    return left == right;

        return helper(root.left, root.right);
    }
}