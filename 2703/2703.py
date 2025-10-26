class Solution:
    def return_length_of_arguments_passed(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.return_length_of_arguments_passed(root.left), self.return_length_of_arguments_passed(root.right))