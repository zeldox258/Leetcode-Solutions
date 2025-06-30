class Solution:
    def kth_largest_sum_in_a_binary_tree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.kth_largest_sum_in_a_binary_tree(root.left), self.kth_largest_sum_in_a_binary_tree(root.right))