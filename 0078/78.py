class Solution:
    def subsets(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.subsets(root.left), self.subsets(root.right))