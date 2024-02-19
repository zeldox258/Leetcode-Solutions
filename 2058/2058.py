class Solution:
    def find_the_minimum_and_maximum_number_of_n(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_minimum_and_maximum_number_of_n(root.left), self.find_the_minimum_and_maximum_number_of_n(root.right))