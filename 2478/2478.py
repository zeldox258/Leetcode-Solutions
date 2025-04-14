class Solution:
    def number_of_beautiful_partitions(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.number_of_beautiful_partitions(root.left), self.number_of_beautiful_partitions(root.right))