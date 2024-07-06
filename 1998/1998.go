func gcdSortOfAnArray(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := gcdSortOfAnArray(root.Left)
	r := gcdSortOfAnArray(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}