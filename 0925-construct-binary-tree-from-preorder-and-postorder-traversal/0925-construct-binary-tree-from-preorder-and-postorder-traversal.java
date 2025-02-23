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
    int pre_ind=0;
    int post_ind=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root=new TreeNode(preorder[pre_ind]);
        pre_ind++;
        if(root.val!=postorder[post_ind]){
            root.left=constructFromPrePost(preorder,postorder);
        }
        if(root.val!=postorder[post_ind]){
            root.right=constructFromPrePost(preorder,postorder);
        }
        post_ind++;
        return root;
    }
}