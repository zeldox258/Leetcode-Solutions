class Solution:
    def rotate_image(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.rotate_image(root.left), self.rotate_image(root.right))