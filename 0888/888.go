func fairCandySwap(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := fairCandySwap(root.Left)
	r := fairCandySwap(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}