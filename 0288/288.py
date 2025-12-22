class Solution:
    def unique_word_abbreviation(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.unique_word_abbreviation(root.left), self.unique_word_abbreviation(root.right))