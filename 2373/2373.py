class Solution:
    def largest_local_values_in_a_matrix(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.largest_local_values_in_a_matrix(root.left), self.largest_local_values_in_a_matrix(root.right))