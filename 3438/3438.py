class Solution:
    def find_valid_pair_of_adjacent_digits_in_st(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_valid_pair_of_adjacent_digits_in_st(root.left), self.find_valid_pair_of_adjacent_digits_in_st(root.right))