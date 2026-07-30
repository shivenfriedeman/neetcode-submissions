# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        # traverse the tree to the nodes, building a stack of nodes passed (O(log(n)))
        # Problem: what is the comparison logic to identify the common ancestor

        # O(h): Binary search ensures the left child is less than the root, right child
        # is greater than the root. We can use this property to 

        lv, hv = sorted([p.val, q.val])

        def helper(root, lv, hv):
            if lv <= root.val <= hv:
                return root
            if lv < root.val:
                return helper(root.left, lv, hv)
            else:
                return helper(root.right, lv, hv)

        return helper(root, lv, hv)

        
        