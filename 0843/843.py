class Solution:
    def guess_the_word(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.guess_the_word(root.left), self.guess_the_word(root.right))