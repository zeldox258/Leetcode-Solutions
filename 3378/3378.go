func countConnectedComponentsInLcmG(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := countConnectedComponentsInLcmG(root.Left)
	r := countConnectedComponentsInLcmG(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}