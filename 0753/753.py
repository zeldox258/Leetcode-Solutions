class Solution:
    def cracking_the_safe(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.cracking_the_safe(root.left), self.cracking_the_safe(root.right))