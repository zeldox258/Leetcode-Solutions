func longestNondecreasingSubarrayAf(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := longestNondecreasingSubarrayAf(root.Left)
	r := longestNondecreasingSubarrayAf(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}