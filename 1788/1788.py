class Solution:
    def maximize_the_beauty_of_the_garden(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximize_the_beauty_of_the_garden(root.left), self.maximize_the_beauty_of_the_garden(root.right))