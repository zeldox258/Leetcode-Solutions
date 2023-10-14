func maximizeAreaOfSquareHoleInGrid(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximizeAreaOfSquareHoleInGrid(root.Left)
	r := maximizeAreaOfSquareHoleInGrid(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}