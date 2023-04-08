class Solution:
    def restore_the_array_from_adjacent_pairs(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.restore_the_array_from_adjacent_pairs(root.left), self.restore_the_array_from_adjacent_pairs(root.right))