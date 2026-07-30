# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        balance = True

        def helper(curr):
            if not curr:
                return 0
            
            left = helper(curr.left)
            right = helper(curr.right)
            dif = abs(left - right)

            if dif > 1:
                nonlocal balance
                balance = False
            
            return 1 + max(left, right)
            
        helper(root)
        return balance