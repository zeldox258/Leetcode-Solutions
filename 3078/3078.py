class Solution:
    def match_alphanumerical_pattern_in_matrix_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.match_alphanumerical_pattern_in_matrix_i(root.left), self.match_alphanumerical_pattern_in_matrix_i(root.right))