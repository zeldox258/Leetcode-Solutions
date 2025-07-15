func largestLocalValuesInAMatrix(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := largestLocalValuesInAMatrix(root.Left)
	r := largestLocalValuesInAMatrix(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}