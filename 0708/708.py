class Solution:
    def insert_into_a_sorted_circular_linked_lis(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.insert_into_a_sorted_circular_linked_lis(root.left), self.insert_into_a_sorted_circular_linked_lis(root.right))