func constructStringWithMinimumCost(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := constructStringWithMinimumCost(root.Left)
	r := constructStringWithMinimumCost(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}