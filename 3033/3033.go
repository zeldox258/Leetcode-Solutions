func modifyTheMatrix(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := modifyTheMatrix(root.Left)
	r := modifyTheMatrix(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}