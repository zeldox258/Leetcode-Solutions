class Solution:
    def maximum_coins_heroes_can_collect(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_coins_heroes_can_collect(root.left), self.maximum_coins_heroes_can_collect(root.right))