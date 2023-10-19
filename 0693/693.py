class Solution:
    def binary_number_with_alternating_bits(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.binary_number_with_alternating_bits(root.left), self.binary_number_with_alternating_bits(root.right))