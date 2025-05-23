class Solution:
    def unique_paths_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.unique_paths_ii(root.left), self.unique_paths_ii(root.right))