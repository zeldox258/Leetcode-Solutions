class Solution:
    def count_unique_characters_of_all_substring(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.count_unique_characters_of_all_substring(root.left), self.count_unique_characters_of_all_substring(root.right))