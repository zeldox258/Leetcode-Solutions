class Solution:
    def simple_bank_system(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.simple_bank_system(root.left), self.simple_bank_system(root.right))