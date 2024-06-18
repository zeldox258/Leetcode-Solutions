class Solution:
    def number_of_recent_calls(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_recent_calls(root.left), self.number_of_recent_calls(root.right))