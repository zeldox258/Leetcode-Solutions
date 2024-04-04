class Solution:
    def rings_and_rods(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.rings_and_rods(root.left), self.rings_and_rods(root.right))