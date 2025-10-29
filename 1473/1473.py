class Solution:
    def paint_house_iii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.paint_house_iii(root.left), self.paint_house_iii(root.right))