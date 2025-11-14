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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> output=new ArrayList<>();
        dfs(root, targetSum, 0, output, new ArrayList<>());
        return output;
    }
    public void dfs(TreeNode root, int target, int cur_sum, List<List<Integer>> output, List<Integer> curPath){
        if(root==null) return;
        cur_sum+=root.val;
        curPath.add(root.val);
        if(root.left==null && root.right==null && cur_sum==target){
            output.add(new ArrayList<>(curPath));
        }
        dfs(root.left,target,cur_sum,output,curPath);
        dfs(root.right,target,cur_sum,output,curPath);
        curPath.remove(curPath.size()-1);
    }
}