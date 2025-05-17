func minimumFlipsInBinaryTreeToGetR(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumFlipsInBinaryTreeToGetR(root.Left)
	r := minimumFlipsInBinaryTreeToGetR(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}