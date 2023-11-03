class Solution:
    def the_number_of_ways_to_make_the_sum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.the_number_of_ways_to_make_the_sum(root.left), self.the_number_of_ways_to_make_the_sum(root.right))