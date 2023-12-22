class Solution:
    def gcd_sort_of_an_array(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.gcd_sort_of_an_array(root.left), self.gcd_sort_of_an_array(root.right))