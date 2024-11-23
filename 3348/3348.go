func smallestDivisibleDigitProductI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := smallestDivisibleDigitProductI(root.Left)
	r := smallestDivisibleDigitProductI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}