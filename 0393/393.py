class Solution:
    def utf8_validation(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.utf8_validation(root.left), self.utf8_validation(root.right))