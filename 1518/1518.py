class Solution:
    def water_bottles(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.water_bottles(root.left), self.water_bottles(root.right))