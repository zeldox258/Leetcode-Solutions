func maximizeSumOfSquaresOfDigits(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximizeSumOfSquaresOfDigits(root.Left)
	r := maximizeSumOfSquaresOfDigits(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}