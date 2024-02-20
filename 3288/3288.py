class Solution:
    def length_of_the_longest_increasing_path(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.length_of_the_longest_increasing_path(root.left), self.length_of_the_longest_increasing_path(root.right))