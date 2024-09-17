class Solution:
    def camelcase_matching(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.camelcase_matching(root.left), self.camelcase_matching(root.right))