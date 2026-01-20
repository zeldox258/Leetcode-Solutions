class Solution:
    def maximum_product_of_word_lengths(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_product_of_word_lengths(root.left), self.maximum_product_of_word_lengths(root.right))