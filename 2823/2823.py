class Solution:
    def deep_object_filter(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.deep_object_filter(root.left), self.deep_object_filter(root.right))