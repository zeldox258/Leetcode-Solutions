func designTaskManager(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := designTaskManager(root.Left)
	r := designTaskManager(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}