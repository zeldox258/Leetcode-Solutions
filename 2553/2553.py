class Solution:
    def separate_the_digits_in_an_array(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.separate_the_digits_in_an_array(root.left), self.separate_the_digits_in_an_array(root.right))