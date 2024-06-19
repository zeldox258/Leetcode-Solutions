class Solution:
    def maximum_split_of_positive_even_integers(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_split_of_positive_even_integers(root.left), self.maximum_split_of_positive_even_integers(root.right))