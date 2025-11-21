class Solution:
    def add_digits(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.add_digits(root.left), self.add_digits(root.right))