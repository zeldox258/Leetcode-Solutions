class Solution:
    def maximum_number_of_groups_entering_a_comp(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_number_of_groups_entering_a_comp(root.left), self.maximum_number_of_groups_entering_a_comp(root.right))