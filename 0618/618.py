class Solution:
    def students_report_by_geography(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        return 1 + max(self.students_report_by_geography(root.left), self.students_report_by_geography(root.right))