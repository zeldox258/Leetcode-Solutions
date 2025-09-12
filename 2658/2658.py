class Solution:
    def maximum_number_of_fish_in_a_grid(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_number_of_fish_in_a_grid(root.left), self.maximum_number_of_fish_in_a_grid(root.right))