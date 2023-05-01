func sumOfSquaresOfSpecialElements(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sumOfSquaresOfSpecialElements(root.Left)
	r := sumOfSquaresOfSpecialElements(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}