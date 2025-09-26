class Solution:
    def make_costs_of_paths_equal_in_a_binary_tr(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.make_costs_of_paths_equal_in_a_binary_tr(root.left), self.make_costs_of_paths_equal_in_a_binary_tr(root.right))