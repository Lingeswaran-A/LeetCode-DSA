# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        def dfs(node,depth,arr):
            if not node:
                return
            if depth==len(arr):
                arr.append(node.val)
            else:
                arr[depth]=max(arr[depth], node.val)
            dfs(node.left,depth+1,arr)
            dfs(node.right,depth+1,arr)
        arr=[]
        dfs(root,0,arr)
        return arr