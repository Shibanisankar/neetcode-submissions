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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Integer rightVal = null;
            for(int i = queue.size(); i>0 ; i--){
                TreeNode node = queue.poll();
                if(node != null){
                    rightVal = node.val;
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if(rightVal != null)
                res.add(rightVal);  
        }
        return res;
    }
}
