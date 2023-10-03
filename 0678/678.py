class Solution:
    def valid_parenthesis_string(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.valid_parenthesis_string(root.left), self.valid_parenthesis_string(root.right))