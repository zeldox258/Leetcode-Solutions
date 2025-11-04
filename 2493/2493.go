func divideNodesIntoTheMaximumNumbe(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := divideNodesIntoTheMaximumNumbe(root.Left)
	r := divideNodesIntoTheMaximumNumbe(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}