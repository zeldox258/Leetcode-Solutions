class Solution:
    def minimum_time_to_collect_all_apples_in_a_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_time_to_collect_all_apples_in_a_(root.left), self.minimum_time_to_collect_all_apples_in_a_(root.right))