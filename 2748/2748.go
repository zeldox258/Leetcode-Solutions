func numberOfBeautifulPairs(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := numberOfBeautifulPairs(root.Left)
	r := numberOfBeautifulPairs(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}