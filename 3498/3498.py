class Solution:
    def reverse_degree_of_a_string(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.reverse_degree_of_a_string(root.left), self.reverse_degree_of_a_string(root.right))