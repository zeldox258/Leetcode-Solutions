class Solution:
    def query_kth_smallest_trimmed_number(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.query_kth_smallest_trimmed_number(root.left), self.query_kth_smallest_trimmed_number(root.right))