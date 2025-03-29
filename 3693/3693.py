class Solution:
    def climbing_stairs_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.climbing_stairs_ii(root.left), self.climbing_stairs_ii(root.right))