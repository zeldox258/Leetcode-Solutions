func findValidPairOfAdjacentDigitsI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findValidPairOfAdjacentDigitsI(root.Left)
	r := findValidPairOfAdjacentDigitsI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}