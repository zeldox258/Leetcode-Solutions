class Solution:
    def minimum_operations_to_make_all_grid_elem(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_operations_to_make_all_grid_elem(root.left), self.minimum_operations_to_make_all_grid_elem(root.right))