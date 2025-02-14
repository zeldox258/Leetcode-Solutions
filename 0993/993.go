func cousinsInBinaryTree(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := cousinsInBinaryTree(root.Left)
	r := cousinsInBinaryTree(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}