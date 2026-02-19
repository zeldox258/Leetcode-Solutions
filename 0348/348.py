class Solution:
    def design_tictactoe(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.design_tictactoe(root.left), self.design_tictactoe(root.right))