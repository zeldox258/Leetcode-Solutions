func firstElementWithUniqueFrequenc(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := firstElementWithUniqueFrequenc(root.Left)
	r := firstElementWithUniqueFrequenc(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}