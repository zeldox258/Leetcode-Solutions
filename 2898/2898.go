func maximumLinearStockScore(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumLinearStockScore(root.Left)
	r := maximumLinearStockScore(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}