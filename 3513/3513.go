func numberOfUniqueXorTripletsI(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfUniqueXorTripletsI(root.Left)
	r := numberOfUniqueXorTripletsI(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}