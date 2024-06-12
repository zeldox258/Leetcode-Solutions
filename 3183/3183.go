func theNumberOfWaysToMakeTheSum(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := theNumberOfWaysToMakeTheSum(root.Left)
	r := theNumberOfWaysToMakeTheSum(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}