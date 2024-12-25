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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        dfs(root,0,arr);
        return arr;
    }
    public void dfs(TreeNode node,int depth,List<Integer> arr){
        if(node==null){
            return;
        }
        if(depth==arr.size()){
            arr.add(node.val);
        }
        else{
            arr.set(depth,Math.max(arr.get(depth),node.val));
        }
        dfs(node.left,depth+1,arr);
        dfs(node.right,depth+1,arr);
    }
}