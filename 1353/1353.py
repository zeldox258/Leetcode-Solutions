class Solution:
    def maximum_number_of_events_that_can_be_att(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_number_of_events_that_can_be_att(root.left), self.maximum_number_of_events_that_can_be_att(root.right))