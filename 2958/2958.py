class Solution:
    def length_of_longest_subarray_with_at_most_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.length_of_longest_subarray_with_at_most_(root.left), self.length_of_longest_subarray_with_at_most_(root.right))