func lengthOfTheLongestIncreasingPa(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := lengthOfTheLongestIncreasingPa(root.Left)
	r := lengthOfTheLongestIncreasingPa(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}