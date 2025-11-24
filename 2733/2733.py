class Solution:
    def neither_minimum_nor_maximum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.neither_minimum_nor_maximum(root.left), self.neither_minimum_nor_maximum(root.right))