class Solution:
    def minimum_impossible_or(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_impossible_or(root.left), self.minimum_impossible_or(root.right))