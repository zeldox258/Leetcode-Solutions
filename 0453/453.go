func minimumMovesToEqualArrayElemen(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumMovesToEqualArrayElemen(root.Left)
	r := minimumMovesToEqualArrayElemen(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}