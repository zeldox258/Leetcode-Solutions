func minimumDistanceBetweenBstNodes(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumDistanceBetweenBstNodes(root.Left)
	r := minimumDistanceBetweenBstNodes(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}