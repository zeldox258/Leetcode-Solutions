class Solution:
    def largest_even_number(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.largest_even_number(root.left), self.largest_even_number(root.right))