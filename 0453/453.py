class Solution:
    def minimum_moves_to_equal_array_elements(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_moves_to_equal_array_elements(root.left), self.minimum_moves_to_equal_array_elements(root.right))