class Solution:
    def check_if_all_the_integers_in_a_range_are(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.check_if_all_the_integers_in_a_range_are(root.left), self.check_if_all_the_integers_in_a_range_are(root.right))