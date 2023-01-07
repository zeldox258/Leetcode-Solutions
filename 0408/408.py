class Solution:
    def valid_word_abbreviation(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.valid_word_abbreviation(root.left), self.valid_word_abbreviation(root.right))