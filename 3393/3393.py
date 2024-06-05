class Solution:
    def count_paths_with_the_given_xor_value(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_paths_with_the_given_xor_value(root.left), self.count_paths_with_the_given_xor_value(root.right))