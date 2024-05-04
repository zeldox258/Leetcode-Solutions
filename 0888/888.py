class Solution:
    def fair_candy_swap(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.fair_candy_swap(root.left), self.fair_candy_swap(root.right))