func studentsReportByGeography(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := studentsReportByGeography(root.Left)
	r := studentsReportByGeography(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}