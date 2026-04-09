func houseRobberIi(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := houseRobberIi(root.Left)
	r := houseRobberIi(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}