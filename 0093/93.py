class Solution:
    def restore_ip_addresses(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.restore_ip_addresses(root.left), self.restore_ip_addresses(root.right))