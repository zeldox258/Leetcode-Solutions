class Solution:
    def house_robber_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.house_robber_ii(root.left), self.house_robber_ii(root.right))