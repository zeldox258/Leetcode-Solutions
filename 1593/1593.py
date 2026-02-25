class Solution:
    def split_a_string_into_the_max_number_of_un(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.split_a_string_into_the_max_number_of_un(root.left), self.split_a_string_into_the_max_number_of_un(root.right))