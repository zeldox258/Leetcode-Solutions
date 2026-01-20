func bestTimeToBuyAndSellStockIii(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := bestTimeToBuyAndSellStockIii(root.Left)
	r := bestTimeToBuyAndSellStockIii(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}