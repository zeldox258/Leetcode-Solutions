class Solution:
    def game_of_nim(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.game_of_nim(root.left), self.game_of_nim(root.right))