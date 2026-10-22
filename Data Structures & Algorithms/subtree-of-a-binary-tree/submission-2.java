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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null) {
            return false;
        }
        if(isSame(root,subRoot)) {
            return true;
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }
    private boolean isSame(TreeNode p, TreeNode n) {
        if(p == null && n == null) {
             return true;
        }
        if(p != null && n != null && p.val == n.val){
            return isSame(p.left,n.left) && isSame(p.right,n.right);
        } 
        return false;
    }
}
