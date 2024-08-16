class Solution:
    def find_the_number_of_copy_arrays(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_number_of_copy_arrays(root.left), self.find_the_number_of_copy_arrays(root.right))