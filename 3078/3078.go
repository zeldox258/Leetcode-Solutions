func matchAlphanumericalPatternInMa(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := matchAlphanumericalPatternInMa(root.Left)
	r := matchAlphanumericalPatternInMa(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}