func vowelconsonantScore(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := vowelconsonantScore(root.Left)
	r := vowelconsonantScore(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}