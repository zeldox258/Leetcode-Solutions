class Solution:
    def minimum_seconds_to_equalize_a_circular_a(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_seconds_to_equalize_a_circular_a(root.left), self.minimum_seconds_to_equalize_a_circular_a(root.right))