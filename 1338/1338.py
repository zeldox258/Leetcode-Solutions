class Solution:
    def reduce_array_size_to_the_half(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.reduce_array_size_to_the_half(root.left), self.reduce_array_size_to_the_half(root.right))