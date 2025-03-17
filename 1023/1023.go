func camelcaseMatching(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := camelcaseMatching(root.Left)
	r := camelcaseMatching(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}