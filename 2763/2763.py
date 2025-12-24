class Solution:
    def sum_of_imbalance_numbers_of_all_subarray(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_imbalance_numbers_of_all_subarray(root.left), self.sum_of_imbalance_numbers_of_all_subarray(root.right))