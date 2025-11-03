func palindromePartitioningIii(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := palindromePartitioningIii(root.Left)
	r := palindromePartitioningIii(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}