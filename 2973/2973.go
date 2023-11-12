func findNumberOfCoinsToPlaceInTree(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findNumberOfCoinsToPlaceInTree(root.Left)
	r := findNumberOfCoinsToPlaceInTree(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}