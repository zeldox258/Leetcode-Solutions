class Solution:
    def remove_subfolders_from_the_filesystem(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.remove_subfolders_from_the_filesystem(root.left), self.remove_subfolders_from_the_filesystem(root.right))