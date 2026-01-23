class Solution:
    def status_of_flight_tickets(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.status_of_flight_tickets(root.left), self.status_of_flight_tickets(root.right))