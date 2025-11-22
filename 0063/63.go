func uniquePathsIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := uniquePathsIi(root.Left)
	r := uniquePathsIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}