class Solution:
    def count_pairs_with_xor_in_a_range(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_pairs_with_xor_in_a_range(root.left), self.count_pairs_with_xor_in_a_range(root.right))