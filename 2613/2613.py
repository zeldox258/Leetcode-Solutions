class Solution:
    def beautiful_pairs(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.beautiful_pairs(root.left), self.beautiful_pairs(root.right))