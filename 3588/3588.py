class Solution:
    def find_maximum_area_of_a_triangle(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.find_maximum_area_of_a_triangle(root.left), self.find_maximum_area_of_a_triangle(root.right))