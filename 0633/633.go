func sumOfSquareNumbers(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sumOfSquareNumbers(root.Left)
	r := sumOfSquareNumbers(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}