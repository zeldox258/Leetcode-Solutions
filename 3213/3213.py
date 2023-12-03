class Solution:
    def construct_string_with_minimum_cost(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.construct_string_with_minimum_cost(root.left), self.construct_string_with_minimum_cost(root.right))