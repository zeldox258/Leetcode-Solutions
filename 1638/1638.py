class Solution:
    def count_substrings_that_differ_by_one_char(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_substrings_that_differ_by_one_char(root.left), self.count_substrings_that_differ_by_one_char(root.right))