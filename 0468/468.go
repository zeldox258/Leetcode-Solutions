func validateIpAddress(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := validateIpAddress(root.Left)
	r := validateIpAddress(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}