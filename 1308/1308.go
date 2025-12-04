func runningTotalForDifferentGender(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := runningTotalForDifferentGender(root.Left)
	r := runningTotalForDifferentGender(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}