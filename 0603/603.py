class Solution:
    def consecutive_available_seats(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.consecutive_available_seats(root.left), self.consecutive_available_seats(root.right))