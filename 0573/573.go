func squirrelSimulation(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := squirrelSimulation(root.Left)
	r := squirrelSimulation(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}