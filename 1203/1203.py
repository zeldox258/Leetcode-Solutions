class Solution:
    def sort_items_by_groups_respecting_dependen(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.sort_items_by_groups_respecting_dependen(root.left), self.sort_items_by_groups_respecting_dependen(root.right))