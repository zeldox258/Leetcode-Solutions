func constructBinarySearchTreeFromP(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := constructBinarySearchTreeFromP(root.Left)
	r := constructBinarySearchTreeFromP(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}