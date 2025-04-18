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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth_dfs(root);
        return max;
    }
    public int depth_dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        int left=depth_dfs(node.left);
        int right=depth_dfs(node.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}