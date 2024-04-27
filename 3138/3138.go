func minimumLengthOfAnagramConcaten(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := minimumLengthOfAnagramConcaten(root.Left)
	r := minimumLengthOfAnagramConcaten(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}