class Solution:
    def integer_to_english_words(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.integer_to_english_words(root.left), self.integer_to_english_words(root.right))