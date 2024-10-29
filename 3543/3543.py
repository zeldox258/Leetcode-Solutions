class Solution:
    def maximum_weighted_kedge_path(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_weighted_kedge_path(root.left), self.maximum_weighted_kedge_path(root.right))