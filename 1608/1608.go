func specialArrayWithXElementsGreat(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := specialArrayWithXElementsGreat(root.Left)
	r := specialArrayWithXElementsGreat(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}