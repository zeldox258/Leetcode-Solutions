class Solution:
    def find_active_users(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_active_users(root.left), self.find_active_users(root.right))