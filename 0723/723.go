func candyCrush(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := candyCrush(root.Left)
	r := candyCrush(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}