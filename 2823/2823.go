func deepObjectFilter(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := deepObjectFilter(root.Left)
	r := deepObjectFilter(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}