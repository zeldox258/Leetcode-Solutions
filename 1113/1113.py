class Solution:
    def reported_posts(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.reported_posts(root.left), self.reported_posts(root.right))