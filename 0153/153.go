func findMinimumInRotatedSortedArra(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := findMinimumInRotatedSortedArra(root.Left)
	r := findMinimumInRotatedSortedArra(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}