func minimumSensorsToCoverGrid(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumSensorsToCoverGrid(root.Left)
	r := minimumSensorsToCoverGrid(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}