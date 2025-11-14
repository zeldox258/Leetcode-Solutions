class Solution:
    def avoid_flood_in_the_city(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.avoid_flood_in_the_city(root.left), self.avoid_flood_in_the_city(root.right))