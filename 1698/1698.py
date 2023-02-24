class Solution:
    def number_of_distinct_substrings_in_a_strin(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_distinct_substrings_in_a_strin(root.left), self.number_of_distinct_substrings_in_a_strin(root.right))