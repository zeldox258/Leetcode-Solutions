func houseRobber(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := houseRobber(root.Left)
	r := houseRobber(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}