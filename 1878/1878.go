func getBiggestThreeRhombusSumsInAG(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := getBiggestThreeRhombusSumsInAG(root.Left)
	r := getBiggestThreeRhombusSumsInAG(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}