class Solution:
    def max_chunks_to_make_sorted_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.max_chunks_to_make_sorted_ii(root.left), self.max_chunks_to_make_sorted_ii(root.right))