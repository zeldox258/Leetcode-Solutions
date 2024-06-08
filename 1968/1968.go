func arrayWithElementsNotEqualToAve(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := arrayWithElementsNotEqualToAve(root.Left)
	r := arrayWithElementsNotEqualToAve(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}