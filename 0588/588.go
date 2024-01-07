func designInmemoryFileSystem(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := designInmemoryFileSystem(root.Left)
	r := designInmemoryFileSystem(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}