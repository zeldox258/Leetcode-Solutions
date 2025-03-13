class Solution:
    def smallest_absent_positive_greater_than_av(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.smallest_absent_positive_greater_than_av(root.left), self.smallest_absent_positive_greater_than_av(root.right))