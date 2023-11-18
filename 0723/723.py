class Solution:
    def candy_crush(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.candy_crush(root.left), self.candy_crush(root.right))