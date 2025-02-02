func minimumOperationsToHalveArrayS(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumOperationsToHalveArrayS(root.Left)
	r := minimumOperationsToHalveArrayS(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}