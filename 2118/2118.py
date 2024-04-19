class Solution:
    def build_the_equation(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.build_the_equation(root.left), self.build_the_equation(root.right))