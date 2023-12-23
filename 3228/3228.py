class Solution:
    def maximum_number_of_operations_to_move_one(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximum_number_of_operations_to_move_one(root.left), self.maximum_number_of_operations_to_move_one(root.right))