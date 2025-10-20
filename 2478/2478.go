func numberOfBeautifulPartitions(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfBeautifulPartitions(root.Left)
	r := numberOfBeautifulPartitions(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}