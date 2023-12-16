func removeSubfoldersFromTheFilesys(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := removeSubfoldersFromTheFilesys(root.Left)
	r := removeSubfoldersFromTheFilesys(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}