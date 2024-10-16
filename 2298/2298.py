class Solution:
    def tasks_count_in_the_weekend(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.tasks_count_in_the_weekend(root.left), self.tasks_count_in_the_weekend(root.right))