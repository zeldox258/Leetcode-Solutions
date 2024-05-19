class Solution:
    def valid_permutations_for_di_sequence(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.valid_permutations_for_di_sequence(root.left), self.valid_permutations_for_di_sequence(root.right))