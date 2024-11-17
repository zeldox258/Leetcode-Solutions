class Solution:
    def number_of_increasing_paths_in_a_grid(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_increasing_paths_in_a_grid(root.left), self.number_of_increasing_paths_in_a_grid(root.right))