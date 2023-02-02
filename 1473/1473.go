func paintHouseIii(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := paintHouseIii(root.Left)
	r := paintHouseIii(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}