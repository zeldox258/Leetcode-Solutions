class Solution:
    def json_deep_equal(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.json_deep_equal(root.left), self.json_deep_equal(root.right))