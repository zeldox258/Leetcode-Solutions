class Solution:
    def widest_pair_of_indices_with_equal_range_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.widest_pair_of_indices_with_equal_range_(root.left), self.widest_pair_of_indices_with_equal_range_(root.right))