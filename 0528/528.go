func randomPickWithWeight(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := randomPickWithWeight(root.Left)
	r := randomPickWithWeight(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}