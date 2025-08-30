class Solution:
    def minimum_value_to_get_positive_step_by_st(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_value_to_get_positive_step_by_st(root.left), self.minimum_value_to_get_positive_step_by_st(root.right))