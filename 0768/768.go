func maxChunksToMakeSortedIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maxChunksToMakeSortedIi(root.Left)
	r := maxChunksToMakeSortedIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}