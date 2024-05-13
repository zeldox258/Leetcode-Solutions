func sumOfDigitDifferencesOfAllPair(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := sumOfDigitDifferencesOfAllPair(root.Left)
	r := sumOfDigitDifferencesOfAllPair(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}