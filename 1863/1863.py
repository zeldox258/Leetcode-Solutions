class Solution:
    def sum_of_all_subset_xor_totals(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sum_of_all_subset_xor_totals(root.left), self.sum_of_all_subset_xor_totals(root.right))