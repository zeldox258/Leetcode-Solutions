class Solution:
    def squirrel_simulation(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.squirrel_simulation(root.left), self.squirrel_simulation(root.right))