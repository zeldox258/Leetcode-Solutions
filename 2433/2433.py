class Solution:
    def find_the_original_array_of_prefix_xor(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_original_array_of_prefix_xor(root.left), self.find_the_original_array_of_prefix_xor(root.right))