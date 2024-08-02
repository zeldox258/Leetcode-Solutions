class Solution:
    def separate_squares_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.separate_squares_i(root.left), self.separate_squares_i(root.right))