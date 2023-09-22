func smallestGoodBase(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := smallestGoodBase(root.Left)
	r := smallestGoodBase(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}