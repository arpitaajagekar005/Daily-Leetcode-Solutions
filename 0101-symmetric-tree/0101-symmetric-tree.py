# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if root == None:
            return True
        return self.is_same(root.left,root.right)

    def is_same(self,p,q):

        if p==None and q==None:
            return True

        if not p or not q:
            return False

        if p.val != q.val:
            return False
        return self.is_same(p.left,q.right) and self.is_same(p.right,q.left)