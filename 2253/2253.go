func dynamicUnpivotingOfATable(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := dynamicUnpivotingOfATable(root.Left)
	r := dynamicUnpivotingOfATable(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}