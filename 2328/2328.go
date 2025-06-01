func numberOfIncreasingPathsInAGrid(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfIncreasingPathsInAGrid(root.Left)
	r := numberOfIncreasingPathsInAGrid(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}