func kthSmallestElementInASortedMat(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := kthSmallestElementInASortedMat(root.Left)
	r := kthSmallestElementInASortedMat(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}