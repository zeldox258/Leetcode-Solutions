class Solution:
    def find_the_maximum_number_of_fruits_collec(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_maximum_number_of_fruits_collec(root.left), self.find_the_maximum_number_of_fruits_collec(root.right))