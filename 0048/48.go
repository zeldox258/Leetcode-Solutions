func rotateImage(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := rotateImage(root.Left)
	r := rotateImage(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}