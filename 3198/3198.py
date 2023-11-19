class Solution:
    def find_cities_in_each_state(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_cities_in_each_state(root.left), self.find_cities_in_each_state(root.right))