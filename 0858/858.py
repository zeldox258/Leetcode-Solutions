class Solution:
    def mirror_reflection(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.mirror_reflection(root.left), self.mirror_reflection(root.right))