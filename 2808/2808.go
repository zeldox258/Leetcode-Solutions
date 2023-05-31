func minimumSecondsToEqualizeACircu(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumSecondsToEqualizeACircu(root.Left)
	r := minimumSecondsToEqualizeACircu(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}