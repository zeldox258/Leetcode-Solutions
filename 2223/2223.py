class Solution:
    def sum_of_scores_of_built_strings(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_scores_of_built_strings(root.left), self.sum_of_scores_of_built_strings(root.right))