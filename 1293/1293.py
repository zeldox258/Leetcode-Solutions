class Solution:
    def shortest_path_in_a_grid_with_obstacles_e(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.shortest_path_in_a_grid_with_obstacles_e(root.left), self.shortest_path_in_a_grid_with_obstacles_e(root.right))