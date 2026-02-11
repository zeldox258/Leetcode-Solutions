class Solution:
    def minimum_time_to_make_rope_colorful(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_time_to_make_rope_colorful(root.left), self.minimum_time_to_make_rope_colorful(root.right))