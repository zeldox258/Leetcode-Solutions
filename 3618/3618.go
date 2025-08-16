func splitArrayByPrimeIndices(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := splitArrayByPrimeIndices(root.Left)
	r := splitArrayByPrimeIndices(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}