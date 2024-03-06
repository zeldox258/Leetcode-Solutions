class Solution:
    def time_needed_to_buy_tickets(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.time_needed_to_buy_tickets(root.left), self.time_needed_to_buy_tickets(root.right))