func minimumAreaRectangleIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumAreaRectangleIi(root.Left)
	r := minimumAreaRectangleIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}