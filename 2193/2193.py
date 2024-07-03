class Solution:
    def minimum_number_of_moves_to_make_palindro(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.minimum_number_of_moves_to_make_palindro(root.left), self.minimum_number_of_moves_to_make_palindro(root.right))