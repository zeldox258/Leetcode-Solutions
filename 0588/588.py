class Solution:
    def design_inmemory_file_system(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.design_inmemory_file_system(root.left), self.design_inmemory_file_system(root.right))