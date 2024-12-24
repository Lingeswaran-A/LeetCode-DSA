# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    maxi=0
    def depth_dfs(self,node: Optional[TreeNode])-> int:
            if not node:
                return 0
            left=self.depth_dfs(node.left)
            right=self.depth_dfs(node.right)
            self.maxi=max(self.maxi,left+right)
            return max(left,right)+1
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.depth_dfs(root)
        return self.maxi