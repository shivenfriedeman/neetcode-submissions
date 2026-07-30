# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:   
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        
        def helper(r, s):
            if r is None or s is None:
                return r is s
            
            if r.val == s.val:
                return helper(r.left, s.left) and helper(r.right, s.right)
            
            return False

        if not subRoot:
            return True
        if not root:
            return False

        if helper(root, subRoot):
            return True
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)