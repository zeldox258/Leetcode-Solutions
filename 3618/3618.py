class Solution:
    def split_array_by_prime_indices(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.split_array_by_prime_indices(root.left), self.split_array_by_prime_indices(root.right))