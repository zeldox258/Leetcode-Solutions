class Solution:
    def minimum_operations_to_halve_array_sum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_operations_to_halve_array_sum(root.left), self.minimum_operations_to_halve_array_sum(root.right))