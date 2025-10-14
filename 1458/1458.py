class Solution:
    def max_dot_product_of_two_subsequences(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.max_dot_product_of_two_subsequences(root.left), self.max_dot_product_of_two_subsequences(root.right))