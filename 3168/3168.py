class Solution:
    def minimum_number_of_chairs_in_a_waiting_ro(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_number_of_chairs_in_a_waiting_ro(root.left), self.minimum_number_of_chairs_in_a_waiting_ro(root.right))