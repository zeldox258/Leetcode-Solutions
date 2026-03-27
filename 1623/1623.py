class Solution:
    def all_valid_triplets_that_can_represent_a_(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.all_valid_triplets_that_can_represent_a_(root.left), self.all_valid_triplets_that_can_represent_a_(root.right))