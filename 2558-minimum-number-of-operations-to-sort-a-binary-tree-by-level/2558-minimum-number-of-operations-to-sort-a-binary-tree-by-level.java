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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int swaps_count=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            int[] level=new int[size];
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                level[i]=node.val;
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            swaps_count+=get_swaps_count(level);
        }
        return swaps_count;
    }
    private int get_swaps_count(int[] arr){
        int swaps=0;
        int[] target=arr.clone();
        Arrays.sort(target);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target[i]){
                swaps++;
                int cur=map.get(target[i]);
                map.put(arr[i],cur);
                arr[cur]=arr[i];
            }
        }
        return swaps;
    }
}