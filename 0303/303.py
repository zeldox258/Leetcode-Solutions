class Solution:
    def range_sum_query_immutable(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.range_sum_query_immutable(root.left), self.range_sum_query_immutable(root.right))