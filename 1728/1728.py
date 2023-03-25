class Solution:
    def cat_and_mouse_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.cat_and_mouse_ii(root.left), self.cat_and_mouse_ii(root.right))