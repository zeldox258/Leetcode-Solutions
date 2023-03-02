func sumOfMatrixAfterQueries(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sumOfMatrixAfterQueries(root.Left)
	r := sumOfMatrixAfterQueries(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}