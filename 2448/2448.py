class Solution:
    def minimum_cost_to_make_array_equal(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_cost_to_make_array_equal(root.left), self.minimum_cost_to_make_array_equal(root.right))