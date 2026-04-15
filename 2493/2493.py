class Solution:
    def divide_nodes_into_the_maximum_number_of_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.divide_nodes_into_the_maximum_number_of_(root.left), self.divide_nodes_into_the_maximum_number_of_(root.right))