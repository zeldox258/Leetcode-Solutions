func rangeSumQueryImmutable(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := rangeSumQueryImmutable(root.Left)
	r := rangeSumQueryImmutable(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}