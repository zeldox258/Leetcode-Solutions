func subsets(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := subsets(root.Left)
	r := subsets(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}