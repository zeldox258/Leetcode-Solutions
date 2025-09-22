class Solution:
    def house_robber(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.house_robber(root.left), self.house_robber(root.right))