class Solution:
    def find_the_index_of_the_large_integer(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_the_index_of_the_large_integer(root.left), self.find_the_index_of_the_large_integer(root.right))