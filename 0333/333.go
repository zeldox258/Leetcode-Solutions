func largestBstSubtree(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := largestBstSubtree(root.Left)
	r := largestBstSubtree(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}