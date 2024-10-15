class Solution:
    def previous_permutation_with_one_swap(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.previous_permutation_with_one_swap(root.left), self.previous_permutation_with_one_swap(root.right))