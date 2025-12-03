func closestPrimeNumbersInRange(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := closestPrimeNumbersInRange(root.Left)
	r := closestPrimeNumbersInRange(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}