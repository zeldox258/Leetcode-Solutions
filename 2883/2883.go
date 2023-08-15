func dropMissingData(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := dropMissingData(root.Left)
	r := dropMissingData(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}