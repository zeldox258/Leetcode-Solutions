class Solution:
    def change_null_values_in_a_table_to_the_pre(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.change_null_values_in_a_table_to_the_pre(root.left), self.change_null_values_in_a_table_to_the_pre(root.right))