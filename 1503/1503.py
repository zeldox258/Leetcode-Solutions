class Solution:
    def last_moment_before_all_ants_fall_out_of_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.last_moment_before_all_ants_fall_out_of_(root.left), self.last_moment_before_all_ants_fall_out_of_(root.right))