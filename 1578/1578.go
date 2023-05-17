func minimumTimeToMakeRopeColorful(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumTimeToMakeRopeColorful(root.Left)
	r := minimumTimeToMakeRopeColorful(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}