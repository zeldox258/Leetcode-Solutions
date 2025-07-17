class Solution:
    def minimum_cost_to_make_at_least_one_valid_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_cost_to_make_at_least_one_valid_(root.left), self.minimum_cost_to_make_at_least_one_valid_(root.right))