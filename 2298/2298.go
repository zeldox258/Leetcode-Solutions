func tasksCountInTheWeekend(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := tasksCountInTheWeekend(root.Left)
	r := tasksCountInTheWeekend(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}