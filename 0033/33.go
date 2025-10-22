func searchInRotatedSortedArray(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := searchInRotatedSortedArray(root.Left)
	r := searchInRotatedSortedArray(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}