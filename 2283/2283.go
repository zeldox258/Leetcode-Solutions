func checkIfNumberHasEqualDigitCoun(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := checkIfNumberHasEqualDigitCoun(root.Left)
	r := checkIfNumberHasEqualDigitCoun(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}