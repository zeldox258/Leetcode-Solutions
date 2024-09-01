class Solution:
    def dynamic_unpivoting_of_a_table(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.dynamic_unpivoting_of_a_table(root.left), self.dynamic_unpivoting_of_a_table(root.right))