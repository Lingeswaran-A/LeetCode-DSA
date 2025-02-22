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
    public TreeNode recoverFromPreorder(String traversal) {
        int n=traversal.length();
        TreeNode[] lst=new TreeNode[10001];
        int root=0,ind=0;
        while(ind<n && traversal.charAt(ind)!='-'){
            root=root*10+(traversal.charAt(ind)-'0');
            ind++;
        }
        lst[0]=new TreeNode(root);
        while(ind<n){
            int count=0;
            while(ind<n && traversal.charAt(ind)=='-'){
                ind++;
                count++;
            }
            int node=0;
            while(ind<n && traversal.charAt(ind)!='-'){
                node=node*10+(traversal.charAt(ind)-'0');
                ind++;
            }
            TreeNode child=new TreeNode(node);
            TreeNode parent=lst[count-1];
            if(parent.left==null) parent.left=child;
            else parent.right=child;
            lst[count]=child;
        }
        return lst[0];
    }
}