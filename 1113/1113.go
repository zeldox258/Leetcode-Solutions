func reportedPosts(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := reportedPosts(root.Left)
	r := reportedPosts(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}