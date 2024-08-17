class Solution:
    def number_of_times_a_driver_was_a_passenger(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_times_a_driver_was_a_passenger(root.left), self.number_of_times_a_driver_was_a_passenger(root.right))