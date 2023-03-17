func neitherMinimumNorMaximum(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := neitherMinimumNorMaximum(root.Left)
	r := neitherMinimumNorMaximum(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}