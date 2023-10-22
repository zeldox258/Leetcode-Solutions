func findBottomLeftTreeValue(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findBottomLeftTreeValue(root.Left)
	r := findBottomLeftTreeValue(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}