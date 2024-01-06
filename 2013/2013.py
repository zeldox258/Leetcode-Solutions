class Solution:
    def detect_squares(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.detect_squares(root.left), self.detect_squares(root.right))