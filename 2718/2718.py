class Solution:
    def sum_of_matrix_after_queries(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_matrix_after_queries(root.left), self.sum_of_matrix_after_queries(root.right))