func maximumNumberOfFishInAGrid(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumNumberOfFishInAGrid(root.Left)
	r := maximumNumberOfFishInAGrid(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}