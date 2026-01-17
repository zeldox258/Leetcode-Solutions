func maximumNumberOfEventsThatCanBe(root *TreeNode) int {
	if root == nil {
		return 0
	}
	l := maximumNumberOfEventsThatCanBe(root.Left)
	r := maximumNumberOfEventsThatCanBe(root.Right)
	if l > r {
		return 1 + l
	}
	return 1 + r
}