func findActiveUsers(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findActiveUsers(root.Left)
	r := findActiveUsers(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}