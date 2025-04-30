class Solution:
    def closest_prime_numbers_in_range(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.closest_prime_numbers_in_range(root.left), self.closest_prime_numbers_in_range(root.right))