class Solution:
    def minimum_length_of_anagram_concatenation(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_length_of_anagram_concatenation(root.left), self.minimum_length_of_anagram_concatenation(root.right))