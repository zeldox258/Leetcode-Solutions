func longestArithmeticSubsequenceOf(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := longestArithmeticSubsequenceOf(root.Left)
	r := longestArithmeticSubsequenceOf(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}