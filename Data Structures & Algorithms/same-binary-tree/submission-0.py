# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:

        def helper(curr1, curr2):
            if curr1 is None and curr2 is None:
                return True
            elif curr1 is None or curr2 is None:
                return False
            elif curr1.val != curr2.val:
                return False
            else:
                return helper(curr1.left, curr2.left) and helper(curr1.right, curr2.right)
        
        return helper(p, q)
        