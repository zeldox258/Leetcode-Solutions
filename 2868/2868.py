class Solution:
    def the_wording_game(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.the_wording_game(root.left), self.the_wording_game(root.right))