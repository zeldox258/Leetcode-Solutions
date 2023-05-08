class Solution:
    def maximize_the_number_of_partitions_after_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.maximize_the_number_of_partitions_after_(root.left), self.maximize_the_number_of_partitions_after_(root.right))