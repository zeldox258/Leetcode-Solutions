class Solution:
    def stone_game_v(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.stone_game_v(root.left), self.stone_game_v(root.right))