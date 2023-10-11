func catAndMouseIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := catAndMouseIi(root.Left)
	r := catAndMouseIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}