func 4sum(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := 4sum(root.Left)
	r := 4sum(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}