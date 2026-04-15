func findTheLeastFrequentDigit(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findTheLeastFrequentDigit(root.Left)
	r := findTheLeastFrequentDigit(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}