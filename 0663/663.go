func equalTreePartition(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := equalTreePartition(root.Left)
	r := equalTreePartition(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}