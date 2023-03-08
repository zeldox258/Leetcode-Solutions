class Solution:
    def maximize_area_of_square_hole_in_grid(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximize_area_of_square_hole_in_grid(root.left), self.maximize_area_of_square_hole_in_grid(root.right))