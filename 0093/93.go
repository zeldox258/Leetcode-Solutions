func restoreIpAddresses(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := restoreIpAddresses(root.Left)
	r := restoreIpAddresses(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}