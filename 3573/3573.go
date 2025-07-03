func bestTimeToBuyAndSellStockV(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := bestTimeToBuyAndSellStockV(root.Left)
	r := bestTimeToBuyAndSellStockV(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}