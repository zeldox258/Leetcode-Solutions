class Solution:
    def earliest_second_to_mark_indices_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.earliest_second_to_mark_indices_i(root.left), self.earliest_second_to_mark_indices_i(root.right))