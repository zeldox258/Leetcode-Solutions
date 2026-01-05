func minimumInversionCountInSubarra(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumInversionCountInSubarra(root.Left)
	r := minimumInversionCountInSubarra(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}