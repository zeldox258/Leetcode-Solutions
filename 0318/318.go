func maximumProductOfWordLengths(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumProductOfWordLengths(root.Left)
	r := maximumProductOfWordLengths(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}