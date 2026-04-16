class Solution:
    def 4sum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.4sum(root.left), self.4sum(root.right))