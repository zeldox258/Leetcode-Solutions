func countPairsWithXorInARange(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countPairsWithXorInARange(root.Left)
	r := countPairsWithXorInARange(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}