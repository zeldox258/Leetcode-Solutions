func checkIfAllTheIntegersInARangeA(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := checkIfAllTheIntegersInARangeA(root.Left)
	r := checkIfAllTheIntegersInARangeA(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}