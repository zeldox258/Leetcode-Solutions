func maximumNumberOfOperationsToMov(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumNumberOfOperationsToMov(root.Left)
	r := maximumNumberOfOperationsToMov(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}