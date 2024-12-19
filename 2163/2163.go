func minimumDifferenceInSumsAfterRe(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumDifferenceInSumsAfterRe(root.Left)
	r := minimumDifferenceInSumsAfterRe(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}