# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def lowestCommonAncestor(self, root: TreeNode, p: TreeNode, q: TreeNode) -> TreeNode:
        lv, hv = sorted([p.val, q.val])
        node = root

        while not (lv <= node.val <= hv):
            node = node.left if lv < node.val else node.right
        return node