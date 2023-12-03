class Solution:
    def monotone_increasing_digits(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.monotone_increasing_digits(root.left), self.monotone_increasing_digits(root.right))