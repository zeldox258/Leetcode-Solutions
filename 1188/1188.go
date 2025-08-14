func designBoundedBlockingQueue(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := designBoundedBlockingQueue(root.Left)
	r := designBoundedBlockingQueue(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}