func monotoneIncreasingDigits(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := monotoneIncreasingDigits(root.Left)
	r := monotoneIncreasingDigits(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}