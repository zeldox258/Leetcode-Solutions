class Solution:
    def validate_ip_address(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.validate_ip_address(root.left), self.validate_ip_address(root.right))