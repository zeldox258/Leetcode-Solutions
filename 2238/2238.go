func numberOfTimesADriverWasAPassen(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfTimesADriverWasAPassen(root.Left)
	r := numberOfTimesADriverWasAPassen(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}