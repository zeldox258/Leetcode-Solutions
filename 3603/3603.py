class Solution:
    def minimum_cost_path_with_alternating_direc(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_cost_path_with_alternating_direc(root.left), self.minimum_cost_path_with_alternating_direc(root.right))