class Solution:
    def number_of_unique_xor_triplets_i(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_unique_xor_triplets_i(root.left), self.number_of_unique_xor_triplets_i(root.right))