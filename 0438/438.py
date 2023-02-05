class Solution:
    def find_all_anagrams_in_a_string(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_all_anagrams_in_a_string(root.left), self.find_all_anagrams_in_a_string(root.right))