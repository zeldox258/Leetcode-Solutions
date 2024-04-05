class Solution:
    def find_the_original_typed_string_ii(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_original_typed_string_ii(root.left), self.find_the_original_typed_string_ii(root.right))