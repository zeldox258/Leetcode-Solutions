class Solution:
    def total_waviness_of_numbers_in_range_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.total_waviness_of_numbers_in_range_ii(root.left), self.total_waviness_of_numbers_in_range_ii(root.right))