class Solution:
    def minimum_area_rectangle_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_area_rectangle_ii(root.left), self.minimum_area_rectangle_ii(root.right))