func summaryRanges(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := summaryRanges(root.Left)
	r := summaryRanges(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}