class Solution:
    def smallest_divisible_digit_product_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.smallest_divisible_digit_product_ii(root.left), self.smallest_divisible_digit_product_ii(root.right))