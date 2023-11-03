class Solution:
    def maximum_number_of_weeks_for_which_you_ca(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_number_of_weeks_for_which_you_ca(root.left), self.maximum_number_of_weeks_for_which_you_ca(root.right))