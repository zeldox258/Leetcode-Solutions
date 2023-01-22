class Solution:
    def reconstruct_original_digits_from_english(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.reconstruct_original_digits_from_english(root.left), self.reconstruct_original_digits_from_english(root.right))