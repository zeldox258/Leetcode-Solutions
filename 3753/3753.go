func totalWavinessOfNumbersInRangeI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := totalWavinessOfNumbersInRangeI(root.Left)
	r := totalWavinessOfNumbersInRangeI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}