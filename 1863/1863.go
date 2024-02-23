func sumOfAllSubsetXorTotals(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sumOfAllSubsetXorTotals(root.Left)
	r := sumOfAllSubsetXorTotals(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}