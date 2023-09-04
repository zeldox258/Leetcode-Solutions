class Solution:
    def replace_words(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.replace_words(root.left), self.replace_words(root.right))