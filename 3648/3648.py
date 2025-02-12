class Solution:
    def minimum_sensors_to_cover_grid(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_sensors_to_cover_grid(root.left), self.minimum_sensors_to_cover_grid(root.right))