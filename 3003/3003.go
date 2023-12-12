func maximizeTheNumberOfPartitionsA(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximizeTheNumberOfPartitionsA(root.Left)
	r := maximizeTheNumberOfPartitionsA(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}