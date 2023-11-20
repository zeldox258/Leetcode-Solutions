func diameterOfBinaryTree(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := diameterOfBinaryTree(root.Left)
	r := diameterOfBinaryTree(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}