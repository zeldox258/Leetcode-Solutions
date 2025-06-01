class Solution:
    def maximum_69_number(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_69_number(root.left), self.maximum_69_number(root.right))