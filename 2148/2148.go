func countElementsWithStrictlySmall(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countElementsWithStrictlySmall(root.Left)
	r := countElementsWithStrictlySmall(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}