func minimumAmountOfDamageDealtToBo(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumAmountOfDamageDealtToBo(root.Left)
	r := minimumAmountOfDamageDealtToBo(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}