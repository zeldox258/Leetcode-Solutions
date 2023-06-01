func splitAStringIntoTheMaxNumberOf(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := splitAStringIntoTheMaxNumberOf(root.Left)
	r := splitAStringIntoTheMaxNumberOf(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}