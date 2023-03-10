class Solution:
    def minimum_operations_to_make_a_subsequence(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_operations_to_make_a_subsequence(root.left), self.minimum_operations_to_make_a_subsequence(root.right))