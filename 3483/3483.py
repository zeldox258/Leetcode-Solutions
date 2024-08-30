class Solution:
    def unique_3digit_even_numbers(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.unique_3digit_even_numbers(root.left), self.unique_3digit_even_numbers(root.right))