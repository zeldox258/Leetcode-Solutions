class Solution:
    def get_biggest_three_rhombus_sums_in_a_grid(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.get_biggest_three_rhombus_sums_in_a_grid(root.left), self.get_biggest_three_rhombus_sums_in_a_grid(root.right))